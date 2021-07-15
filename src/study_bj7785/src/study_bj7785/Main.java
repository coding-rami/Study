package study_bj7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//1. 출근시(enter) 사람의 이름을 특정 자료에 저장
//2. 퇴근시(leave) 자료에서 삭제
//3. 자료에 남아 있는 요소들을 내림차순으로 정렬하여 출력

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



