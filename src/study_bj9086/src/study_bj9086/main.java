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
		bw.flush();   //�����ִ� �����͸� ��� ��½�Ŵ
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
	
		
		//1. �׽�Ʈ���̽� ���� �Է¹ޱ� -> ���ڿ��� �Է¹ޱ�
		//2. �Է¹��� ���ڿ��� �迭�� �ֱ�
		//3. �迭�� 0��°�� n��° ���� ����ϱ�
		//4. 
		
			

