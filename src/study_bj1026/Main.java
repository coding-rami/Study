package study_bj1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/* B배열(고정)에 따라 맞는 A배열 값을 다시 만들어 서로 곱해줬는데 런타임에러(널포인터 발생)  
 * 최소값만 구하면 되므로 A배열 오름차순, B2배열 내림차순으로 정렬하여 서로 곱해줌
 */
public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		Integer[] arrA = new Integer[n]; //A배열
		//Integer[] arrA2 = new Integer[n]; //A배열을 재배열한 배열, 어차피 최소값만 구하면 되므로 필요없음
		Integer[] arrB = new Integer[n]; //B배열
		Integer[] arrB2 = new Integer[n]; //B배열을 내림차순으로 정렬한 배열
		int min = 0;
		
		
		for(int i=0; i<n; i++) {
			arrA[i] = Integer.parseInt(st1.nextToken());
		}
		Arrays.sort(arrA);
		
		//같은 StringTokenize를 쓰면 NoSuchElementException 오류가 남
		//문자열에 토큰이없는 경우 NoSuchElementException을 발생시킴
		for(int i=0; i<n; i++) {
			arrB[i] = Integer.parseInt(st2.nextToken());			
			arrB2[i] = arrB[i];
		}
		
		//반복문을 arrA와 arrB2 모두 i=0에서부터 시작하기 위해 내림차순 정렬
		Arrays.sort(arrB2,Collections.reverseOrder());
		
		/*B배열에 따른 A배열을 다시 정렬하기 위한 반복문 
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
