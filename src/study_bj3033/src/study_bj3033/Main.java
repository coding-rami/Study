package study_bj3033;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//1. ���ڿ� ���� L
		//2. ���ڿ��� �迭�� �ֱ�
		//3. �迭 0-1, 0-2, 0-3 ������ �÷����鼭 ���� ���ڿ� �����ؼ� ī��Ʈ
		//4. ī��Ʈ���ڰ� ���� ū ���ڿ��� ���̸� ���
		//KMP�˰��� 
		//���� �ϳ��� ���ϴ� ���� �ƴ϶� ������ �̹� ���ߴ� �߰� �κ��� �ǳʶٸ� ��
		//��� ���ڿ� �� ���λ�� ���̻簡 ���� ���ڿ��� �ִ� ���̸� ���ؼ� �̸� Ȱ���ϴ� �˰���
		//���� ��α� https://bowbowbow.tistory.com/6#comment5168448
		//���� ��α� https://maivve.tistory.com/203
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int result = 0;
		
		//String[] arr = str.split(""); //�ѱ��ھ� �迭�� ����
		
		
		// ��� �κй��ڿ� Ž�� kmp�˰��� �̿�
		for(int i = 0; i < str.length(); i++) {
			String subStr = str.substring(i, str.length());
			result = Math.max(result, getPi(subStr));
		}
			
			System.out.print(result);       	
       
     }
	
	//pi���ϴ� �Լ� kmp �˰��� �̿� 
	static int getPi(String str) {
		int j = 0; // ���λ� �ε����� 0������ ����
		int n = str.length();
		int max = 0; 
		int pi[] = new int[n]; //�ִ���� ���尪
		
		//��)sabcabcfabc
		for(int i = 1; i < n; i++) { // ���̻� �ε����� 1������ �����ϰ� �����ϸ� ���� �ϳ��ϳ� Ž�� 
			while(j > 0 && str.charAt(i) != str.charAt(j)) { //pi[j]=1 && ���λ�� ���̻� ���� ���� ���
				j = pi[j - 1]; // pi�� 
			}
			
			if(str.charAt(i) == str.charAt(j)) {
				pi[i] = ++j; //�ִ���̰� ����, j�� ���λ��̹Ƿ� j ũ�� �������� ����
				max = Math.max(max, pi[i]);
			}		
		}
		return max;
	}
}
	
	/*int kmp(String s, String p){ 
		
		int ans; 
		int  = getPi(p);
		int n = s.length();
		int m = p.length();
		int j =0; 
		
		for(int i = 0 ; i < n ; i++){ 
			
			while(j>0 && s[i] != p[j]) {
				j = pi[j-1];
			}
			
			if(s[i] == p[j]){
				
				if(j == m-1){ 
					ans= i-m+1; 
					j = pi[j]; 
				}
				else{
					j++; 
				} 
			} 
		} 
		return ans;
	}
}*/



