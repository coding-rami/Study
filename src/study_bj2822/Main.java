package study_bj2822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer[] score = new Integer[8];
		Integer[] order = new Integer[8];
		int total = 0;
		
		
		for(int i=0; i<8; i++) {
			score[i] = Integer.valueOf(br.readLine());	
			order[i] = score[i];
		}

		Arrays.sort(order, Collections.reverseOrder());
		
		for(int i=0; i<5; i++) {
			total += order[i];
		}		
		
		System.out.println(total);	
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<5; j++) {
				if(score[i]==order[j])
					System.out.print(i+1+" ");	
			}
		}

	}
}
