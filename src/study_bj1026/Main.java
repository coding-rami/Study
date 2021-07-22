package study_bj1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/* B�迭(����)�� ���� �´� A�迭 ���� �ٽ� ����� ���� ������µ� ��Ÿ�ӿ���(�������� �߻�)  
 * �ּҰ��� ���ϸ� �ǹǷ� A�迭 ��������, B2�迭 ������������ �����Ͽ� ���� ������
 */
public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		Integer[] arrA = new Integer[n]; //A�迭
		//Integer[] arrA2 = new Integer[n]; //A�迭�� ��迭�� �迭, ������ �ּҰ��� ���ϸ� �ǹǷ� �ʿ����
		Integer[] arrB = new Integer[n]; //B�迭
		Integer[] arrB2 = new Integer[n]; //B�迭�� ������������ ������ �迭
		int min = 0;
		
		
		for(int i=0; i<n; i++) {
			arrA[i] = Integer.parseInt(st1.nextToken());
		}
		Arrays.sort(arrA);
		
		//���� StringTokenize�� ���� NoSuchElementException ������ ��
		//���ڿ��� ��ū�̾��� ��� NoSuchElementException�� �߻���Ŵ
		for(int i=0; i<n; i++) {
			arrB[i] = Integer.parseInt(st2.nextToken());			
			arrB2[i] = arrB[i];
		}
		
		//�ݺ����� arrA�� arrB2 ��� i=0�������� �����ϱ� ���� �������� ����
		Arrays.sort(arrB2,Collections.reverseOrder());
		
		/*B�迭�� ���� A�迭�� �ٽ� �����ϱ� ���� �ݺ��� 
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arrB2[i] == arrB1[j]) {
					arrA2[j] = arrA1[i];
					break;
				}		
			}
		}*/
		
		for(int i=0; i<n; i++) {
			min += arrA[i]*arrB2[i];
		}
		System.out.println(min);
	}
}
