package study_bj1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.HashSet;
//import java.util.List;
import java.util.Comparator;
//import java.util.StringTokenizer;

/* 1. HashSet 이용해 중복 단어를 제거하며 저장
 * 2. 문자열 길이 기준으로 정렬
 * 	  길이 정렬을 미리 하지 않아 각 알파벳마다 길이 비교를 해야하는 것은 비효율적
 * 3. 같은 길이 문자열에 대해 사전순 정렬
 */

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0; i<n; i++) {
			set.add(br.readLine());
		}

		//HashSet 값들을 word 배열에 저장
		String[] word = new String[set.size()];
	    set.toArray(word);
	    
	    
	    /*문자열 길이에 따라 정렬
	     *comparator은 리턴값이 음수일 때 요소 위치를 바꾼다.
	     */
	    Arrays.sort(word, new Comparator<String>(){
	    	public int compare(String s1, String s2) {
	    		return Integer.compare(s1.length(), s2.length());	    		
	    	}
	    });
	    
	   
	   for(int i=0; i<word.length; i++) {
		   int j;
		   for(j=i+1; j<word.length; j++) {
			   if(word[i].length()!= word[j].length())  
				   break;				  
		   }
		   //i이상 j미만까지 정렬
		   Arrays.sort(word, i, j);
		   i = j-1; 
		        
	   }
	   
	   for(int i=0; i<word.length; i++)
		   System.out.println(word[i]);
	}
}
