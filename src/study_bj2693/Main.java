package study_bj2693;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int t = Integer.parseInt(br.readLine());
		Integer[] result = new Integer[t];
				
		for(int i=0; i<t; i++) {
			
			Integer[] a = new Integer[10];
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			for(int j=0; j<10; j++) {
				a[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(a, Collections.reverseOrder());
			result[i] = a[2];
			
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(result[i]);
		}
	}
}
