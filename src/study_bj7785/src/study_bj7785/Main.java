package study_bj7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//1. ��ٽ�(enter) ����� �̸��� Ư�� �ڷῡ ����
//2. ��ٽ�(leave) �ڷῡ�� ����
//3. �ڷῡ ���� �ִ� ��ҵ��� ������������ �����Ͽ� ���

public class Main {

     public static void main(String[] args) throws IOException {
		 
		     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		     int n = Integer.parseInt(bf.readLine());
		     Set<String> set = new HashSet<>(); 
		     StringTokenizer st;
		     
		     	for(int i=0; i<n;i++) {
		    	 st = new StringTokenizer(bf.readLine());
		            String name = st.nextToken();
		            String status = st.nextToken();
		     
				   if(status.charAt(0)=='e') {//status[1].startsWith("e")
					set.add(name);  			   
				   }
				   else {
					   set.remove(name);
				   }
		
		    /* 	for(int i=0; i<n;i++) {
				   String[] status = bf.readLine().split(" ");
				   if(status[1]=="enter") {//status[1].startsWith("e")
					set.add(status[0]);  			   
				   }
				   else {
					   set.remove(status[0]);
				   }
		     }		 
		     }*/
		     set.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		     bf.close();
		     
		     	}
     }
}



