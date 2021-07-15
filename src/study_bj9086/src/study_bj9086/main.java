package study_bj9086;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class main {

	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
		String result="";
		for(int i=0; i<n; i++) {
			String str = bf.readLine();	
			String first = str.substring(0,1);
			String last = str.substring(str.length()-1);
			result += first+last+"\n";		
		}
	
		bw.write(result);
		bw.flush();   //남아있는 데이터를 모두 출력시킴
		bf.close();
		bw.close();
	}
}
	

	 // Scanner sc = new Scanner(System.in);
	  //int n = sc.nextInt();
			
				
		//	for(int i =0; i<n;i++) {		
			//StringBuilder sb = new StringBuilder();
			//	 sb.append(sb.charAt(0));
				// sb.append(sb.charAt(sb.length()-1));
				
			 //}
			//char first_word = sb.charAt(0);
			//char last_word = sb.charAt(sb.length()-1);
			
			//sb.append(first_word);
			//sb.append(last_word);
			//String result = new String(sb);
			//System.out.println(new String(sb));
			
	



//for(int x =0; x<a.length ; x++) 
	
		
		//1. 테스트케이스 개수 입력받기 -> 문자열을 입력받기
		//2. 입력받은 문자열을 배열에 넣기
		//3. 배열의 0번째와 n번째 값을 출력하기
		//4. 
		
			

