package study_bj2437;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//1���� ���Ը� ���
//���� �ø��� ���� ������ ���� �������� �۴ٸ�, ������+1�� �ּҰ��� �ȴ�

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
		
		int sum = 0; //sum������ ���Ը� �� �� ����
		for(int i=0; i<n; i++) { 
			
			//���� ������ sum ������ ��� ���Ը� �� �� �ֱ� ������, �� ������ ���� sum+1�� �� ������ �ø� �߸� ���Ѵ� 
			if(sum+1 < number[i]) 
				break;
			
			sum += number[i];
		}
		
		System.out.println(sum+1);
	}
}
