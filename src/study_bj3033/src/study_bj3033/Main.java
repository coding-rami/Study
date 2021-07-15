package study_bj3033;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//1. 문자열 길이 L
		//2. 문자열을 배열에 넣기
		//3. 배열 0-1, 0-2, 0-3 범위를 늘려가면서 같은 문자열 추출해서 카운트
		//4. 카운트숫자가 제일 큰 문자열의 길이를 출력
		//KMP알고리즘 
		//문자 하나씩 비교하는 것이 아니라 이전에 이미 비교했던 중간 부분을 건너뛰며 비교
		//모든 문자열 중 접두사와 접미사가 같은 문자열의 최대 길이를 구해서 이를 활용하는 알고리즘
		//참고 블로그 https://bowbowbow.tistory.com/6#comment5168448
		//참고 블로그 https://maivve.tistory.com/203
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int result = 0;
		
		//String[] arr = str.split(""); //한글자씩 배열에 저장
		
		
		// 모든 부분문자열 탐색 kmp알고리즘 이용
		for(int i = 0; i < str.length(); i++) {
			String subStr = str.substring(i, str.length());
			result = Math.max(result, getPi(subStr));
		}
			
			System.out.print(result);       	
       
     }
	
	//pi구하는 함수 kmp 알고리즘 이용 
	static int getPi(String str) {
		int j = 0; // 접두사 인덱스로 0번부터 시작
		int n = str.length();
		int max = 0; 
		int pi[] = new int[n]; //최대길이 저장값
		
		//예)sabcabcfabc
		for(int i = 1; i < n; i++) { // 접미사 인덱스로 1번부터 시작하고 증가하며 문자 하나하나 탐색 
			while(j > 0 && str.charAt(i) != str.charAt(j)) { //pi[j]=1 && 접두사와 접미사 같지 않을 경우
				j = pi[j - 1]; // pi에 
			}
			
			if(str.charAt(i) == str.charAt(j)) {
				pi[i] = ++j; //최대길이값 저장, j가 접두사이므로 j 크기 기준으로 저장
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



