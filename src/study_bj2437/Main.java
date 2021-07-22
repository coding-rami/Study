package study_bj2437;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//1부터 무게를 잰다
//다음 올리는 추의 값보다 현재 누적합이 작다면, 누적합+1이 최소값이 된다

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Integer[] number = new Integer[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<n; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(number);
		
		int sum = 0; //sum까지는 무게를 잴 수 있음
		for(int i=0; i<n; i++) { 
			
			//추의 누적합 sum 까지는 모두 무게를 잴 수 있기 때문에, 그 다음에 만들 sum+1과 그 다음에 올릴 추를 비교한다 
			if(sum+1 < number[i]) 
				break;
			
			sum += number[i];
		}
		
		System.out.println(sum+1);
	}
}
