package 콘테스트5576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] result = new int[2];
	
	public static void main(String[] args) throws IOException, Exception {
		
		for(int i=0; i<2; i++) {
			result[i] = a();	
			
		}
		System.out.print(String.format("%d %d", result[0], result[1]));
	}
		
	public static int a() throws Exception{
		//int[] score = new int[10];	
		Integer[] score = new Integer[10];
		int sum = 0;
		for(int i=0; i<10; i++) {
			//score[i] = Integer.parseInt(br.readLine());	
			score[i] = Integer.valueOf(br.readLine());	
		}
		
		Arrays.sort(score, Collections.reverseOrder());
		
		
		for(int i=0; i<3; i++) {
			sum += score[i]; 
		}
		
		return sum;
		
		
	}

}
