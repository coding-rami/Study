package study_bj1766;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



//알고리즘: 위상정렬+우선순위큐(최소힙정렬)
/* 
  1.'가능하면 쉬운 문제부터 푼다' 조건으로 인해 기존 큐가 아닌 우선순위큐를 이용해야 함
     기존의 큐는 선입선출이기 때문에!
     최소힙은 값이 가장 작은 데이터가 우선적으로 제거된다.
  2. 자신을 가리키는 간선 개수 indegree[]
     indegree 값이 0인 노드들 담는 큐 pq 사용, 출발노드의 indegree 값은 0, 큐가 비어질 때 까지 반복
  3. 노드 간 간선을 표현하기 위한 2차원 인접리스트 생성한다.
     서로 연결되는 정보를 array리스트에 넣어주며 indegree를 +1 해준다.
  4. 결과를 출력하기 위한 스트링빌더 sb에 큐에서 poll()한 노드를 저장
     반복문 통해 출발노드와 연결된 노드들의 indegree는 -1씩 감소하여, 새로운 노드가 출발노드가 된다.  
*/

public class Main{ 
	
	
	static int N; //문제 수 = 노드 수
	static int M; //간선의 개수 
	
	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	N = Integer.parseInt(st.nextToken()); 
	M = Integer.parseInt(st.nextToken());
	int[] indegree = new int[N+1]; 
	
	
	
	ArrayList<ArrayList<Integer>> array = new ArrayList<>();
	for(int i=0; i<N+1; i++) {
		array.add(new ArrayList<Integer>());
	}
	
	//x 인덱스에 위치에 y값을 추가
	//y는 연결되었으므로 자신을 가리키는 노드 수를 더해줌
	int x, y;
	for(int i=0; i<M; i++) {
		
		st = new StringTokenizer(br.readLine()," ");
		x=Integer.parseInt(st.nextToken());
		y=Integer.parseInt(st.nextToken());
		
		array.get(x).add(y); 
		indegree[y]++; 
	}
	
	topologicalSort(indegree,array);
}

	//위상정렬+우선순위큐
	//우선순위는 숫자가 작을수록 높다
	static void topologicalSort(int[] indegree, ArrayList<ArrayList<Integer>> array) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();  //최소힙 선언
		StringBuilder sb = new StringBuilder(); //출력할 결과를 담는 sb
		
		//출발노드를 큐에 삽입
		for(int i=1; i<N+1; i++) {
			if(indegree[i]==0)
				pq.offer(i);
		}
		
		int node; //큐에서 빼낸 노드를 저장
		while(!pq.isEmpty()) {
			node = pq.poll(); 
			sb.append(node+" "); 
			
			//빠른for문 형식으로 리스트의 반복에서 사용: node와 연결된 노드들이 있다면 next에 저장
			for(int next : array.get(node)) {
				indegree[next]--; 
				
				//출발노드가 되었다면 큐에 삽입
				if(indegree[next]==0) 
					pq.offer(next); 
			}
		}
		
		 System.out.println(sb);
	
	}
		
}
 
