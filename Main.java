package study_bj2210;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
		
	//dfs 백트래킹 알고리즘
	/*	  5x5 값 넣는 배열 map
		  dx[], dy[]의 같은 인덱스에 값을 지정하여 상하좌우를 나타냄
		  ->모든 경우의 수를 다 수행해야 하기 때문에 상하좌우 값을 지정해서 탐색
		  dx=-1, dy=0 이면 좌로 이동, dx=1, dy=0 이면 우로 이동
		  상하좌우로 움직이는 값을 넣는 배열 move
		  6자리 이동 후 완성된 문자열을 넣는 list
		  dfs()는 상하좌우 탐색하는 함수                             */
	
		public static int [][] map; 
		public static int[] dx = { -1, 1, 0, 0 };//x축
		public static int[] dy = { 0, 0, -1, 1 };//y축
		public static int [] move ; 
		public static HashSet<String> list; 
		
		
		public static void main(String[] args ) throws IOException{
				
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st; 
				
				
			map = new int [5][5]; 
			move= new int [6]; 
			
			//입력된 숫자 하나하나를 map 배열에 넣기
			for (int i = 0; i < 5; i++) {
		            st=new StringTokenizer(br.readLine()); 
		            
		            
		            for (int j = 0; j < 5; j++) {
		                map[i][j] = Integer.parseInt(st.nextToken()); 
		            }
			}
				
			
			//list = new ArrayList<>(); 대신 HashSet 사용(자동중복제거)
			list = new HashSet<String>();
			
			//임의의 위치에서 시작하므로 출발 노드를 결정하는 반복문
			for(int i = 0 ; i < 5 ; i++) { 
				for(int j = 0 ; j < 5 ; j++) 
				dfs(i,j,1); 
					
			}
			
			//list에 저장된 문자열의 수를 출력
			System.out.println(list.size());
		}
			
		
		
		
		
		//상하좌우 탐색
		//x,y는 탐색을 시작하는 스타트 노드의 좌표 변수
		public static void dfs(int x, int y , int number) {
			
				//6번 이동했다면 move[]에 있는 정수를 스트링으로 변환
				//문자열 저장하는 변수 str
				if(number > 6) {
					String str = ""; 
					
					for(int i = 0 ; i<move.length; i++) 
						str+= Integer.toString(move[i]);
					
					list.add(str);
					return;
					
					/*
					 리스트에 없다면 넣음(중복 제거)
					 indexOf()는 ArrayList에 인자가 있으면 인덱스 값을, 없으면 -1을 리턴
					
					if(list.indexOf(str) < 0)
						list.add(str);
					*/
				}
				
				
				//6번 이동할 때까지 이동해서 얻은 값을 move 배열에 채움
				//dfs(1,0,2)이라면, map(1,0)값을 move[1]에 넣기 = 2번 이동(move[0]이 1번 이동)
				move[number-1] = map[x][y]; 
										
				
	
				//newx,newy는 상하좌우를 나타내는 좌표 변수
				//탐색순서(newx,newy)는 좌(-1,0)->우(1,0)->하(0,-1)->상(0,1)
				//아래 for문을 통해 결과적인 측면에서는 출발노드에서 가지치기 형식으로 경로를 수행함
				for(int i = 0 ; i < 4 ; i ++) {
					int newx = x + dx[i]; 
					int newy = y + dy[i];
					
					//상하좌우로 이동할 수 있다면 dfs호출
					//이동횟수가 다른 점 외에는 똑같은 일을 수행하므로 재귀함수를 이용
					if(newx>=0 && newx<5 && newy>=0 && newy<5) 
						dfs(newx,newy,number+1); 
					
				}
		}
}
		
	
