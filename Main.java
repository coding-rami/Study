package study_bj2210;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
		
	//dfs ��Ʈ��ŷ �˰���
	/*	  5x5 �� �ִ� �迭 map
		  dx[], dy[]�� ���� �ε����� ���� �����Ͽ� �����¿츦 ��Ÿ��
		  ->��� ����� ���� �� �����ؾ� �ϱ� ������ �����¿� ���� �����ؼ� Ž��
		  dx=-1, dy=0 �̸� �·� �̵�, dx=1, dy=0 �̸� ��� �̵�
		  �����¿�� �����̴� ���� �ִ� �迭 move
		  6�ڸ� �̵� �� �ϼ��� ���ڿ��� �ִ� list
		  dfs()�� �����¿� Ž���ϴ� �Լ�                             */
	
		public static int [][] map; 
		public static int[] dx = { -1, 1, 0, 0 };//x��
		public static int[] dy = { 0, 0, -1, 1 };//y��
		public static int [] move ; 
		public static HashSet<String> list; 
		
		
		public static void main(String[] args ) throws IOException{
				
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st; 
				
				
			map = new int [5][5]; 
			move= new int [6]; 
			
			//�Էµ� ���� �ϳ��ϳ��� map �迭�� �ֱ�
			for (int i = 0; i < 5; i++) {
		            st=new StringTokenizer(br.readLine()); 
		            
		            
		            for (int j = 0; j < 5; j++) {
		                map[i][j] = Integer.parseInt(st.nextToken()); 
		            }
			}
				
			
			//list = new ArrayList<>(); ��� HashSet ���(�ڵ��ߺ�����)
			list = new HashSet<String>();
			
			//������ ��ġ���� �����ϹǷ� ��� ��带 �����ϴ� �ݺ���
			for(int i = 0 ; i < 5 ; i++) { 
				for(int j = 0 ; j < 5 ; j++) 
				dfs(i,j,1); 
					
			}
			
			//list�� ����� ���ڿ��� ���� ���
			System.out.println(list.size());
		}
			
		
		
		
		
		//�����¿� Ž��
		//x,y�� Ž���� �����ϴ� ��ŸƮ ����� ��ǥ ����
		public static void dfs(int x, int y , int number) {
			
				//6�� �̵��ߴٸ� move[]�� �ִ� ������ ��Ʈ������ ��ȯ
				//���ڿ� �����ϴ� ���� str
				if(number > 6) {
					String str = ""; 
					
					for(int i = 0 ; i<move.length; i++) 
						str+= Integer.toString(move[i]);
					
					list.add(str);
					return;
					
					/*
					 ����Ʈ�� ���ٸ� ����(�ߺ� ����)
					 indexOf()�� ArrayList�� ���ڰ� ������ �ε��� ����, ������ -1�� ����
					
					if(list.indexOf(str) < 0)
						list.add(str);
					*/
				}
				
				
				//6�� �̵��� ������ �̵��ؼ� ���� ���� move �迭�� ä��
				//dfs(1,0,2)�̶��, map(1,0)���� move[1]�� �ֱ� = 2�� �̵�(move[0]�� 1�� �̵�)
				move[number-1] = map[x][y]; 
										
				
	
				//newx,newy�� �����¿츦 ��Ÿ���� ��ǥ ����
				//Ž������(newx,newy)�� ��(-1,0)->��(1,0)->��(0,-1)->��(0,1)
				//�Ʒ� for���� ���� ������� ���鿡���� ��߳�忡�� ����ġ�� �������� ��θ� ������
				for(int i = 0 ; i < 4 ; i ++) {
					int newx = x + dx[i]; 
					int newy = y + dy[i];
					
					//�����¿�� �̵��� �� �ִٸ� dfsȣ��
					//�̵�Ƚ���� �ٸ� �� �ܿ��� �Ȱ��� ���� �����ϹǷ� ����Լ��� �̿�
					if(newx>=0 && newx<5 && newy>=0 && newy<5) 
						dfs(newx,newy,number+1); 
					
				}
		}
}
		
	
