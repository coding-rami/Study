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

/* 1. HashSet �̿��� �ߺ� �ܾ �����ϸ� ����
 * 2. ���ڿ� ���� �������� ����
 * 	  ���� ������ �̸� ���� �ʾ� �� ���ĺ����� ���� �񱳸� �ؾ��ϴ� ���� ��ȿ����
 * 3. ���� ���� ���ڿ��� ���� ������ ����
 */

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0; i<n; i++) {
			set.add(br.readLine());
		}

		//HashSet ������ word �迭�� ����
		String[] word = new String[set.size()];
	    set.toArray(word);
	    
	    
	    /*���ڿ� ���̿� ���� ����
	     *comparator�� ���ϰ��� ������ �� ��� ��ġ�� �ٲ۴�.
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
		   //i�̻� j�̸����� ����
		   Arrays.sort(word, i, j);
		   i = j-1; 
		        
	   }
	   
	   for(int i=0; i<word.length; i++)
		   System.out.println(word[i]);
	}
}
