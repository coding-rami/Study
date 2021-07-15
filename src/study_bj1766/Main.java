package study_bj1766;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



//�˰���: ��������+�켱����ť(�ּ�������)
/* 
  1.'�����ϸ� ���� �������� Ǭ��' �������� ���� ���� ť�� �ƴ� �켱����ť�� �̿��ؾ� ��
     ������ ť�� ���Լ����̱� ������!
     �ּ����� ���� ���� ���� �����Ͱ� �켱������ ���ŵȴ�.
  2. �ڽ��� ����Ű�� ���� ���� indegree[]
     indegree ���� 0�� ���� ��� ť pq ���, ��߳���� indegree ���� 0, ť�� ����� �� ���� �ݺ�
  3. ��� �� ������ ǥ���ϱ� ���� 2���� ��������Ʈ �����Ѵ�.
     ���� ����Ǵ� ������ array����Ʈ�� �־��ָ� indegree�� +1 ���ش�.
  4. ����� ����ϱ� ���� ��Ʈ������ sb�� ť���� poll()�� ��带 ����
     �ݺ��� ���� ��߳��� ����� ������ indegree�� -1�� �����Ͽ�, ���ο� ��尡 ��߳�尡 �ȴ�.  
*/

public class Main{ 
	
	
	static int N; //���� �� = ��� ��
	static int M; //������ ���� 
	
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
	
	//x �ε����� ��ġ�� y���� �߰�
	//y�� ����Ǿ����Ƿ� �ڽ��� ����Ű�� ��� ���� ������
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

	//��������+�켱����ť
	//�켱������ ���ڰ� �������� ����
	static void topologicalSort(int[] indegree, ArrayList<ArrayList<Integer>> array) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();  //�ּ��� ����
		StringBuilder sb = new StringBuilder(); //����� ����� ��� sb
		
		//��߳�带 ť�� ����
		for(int i=1; i<N+1; i++) {
			if(indegree[i]==0)
				pq.offer(i);
		}
		
		int node; //ť���� ���� ��带 ����
		while(!pq.isEmpty()) {
			node = pq.poll(); 
			sb.append(node+" "); 
			
			//����for�� �������� ����Ʈ�� �ݺ����� ���: node�� ����� ������ �ִٸ� next�� ����
			for(int next : array.get(node)) {
				indegree[next]--; 
				
				//��߳�尡 �Ǿ��ٸ� ť�� ����
				if(indegree[next]==0) 
					pq.offer(next); 
			}
		}
		
		 System.out.println(sb);
	
	}
		
}
 
