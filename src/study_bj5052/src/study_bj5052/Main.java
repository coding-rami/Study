package study_bj5052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//1.테스트케이스 개수 t
		//2.전화번호의 수 n
		//3.전화번호.length <=10, 중복x
		//입출력 버퍼사용!
		//4.전화번호끼리 일관성 없다면(겹친다면) no, 일관성 있다면 yes 출력
		 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		String[] result = new String[t]; //각 테스트케이스마다 yes,no 값 저장
		
		for(int i=0;i<t;i++) { //t번의 테스트케이스
	          
			int n = Integer.parseInt(br.readLine()); 
	        String[] arr = new String[n];
	                   
	            
	        for(int j=0;j<n;j++) { //n개의 전화번호
	              
	            	arr[j]=br.readLine();
	           
	         }

	        Arrays.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);                    
                }
            }); //사전순으로 정렬 ex)911,91125426,97625999 ...
            
            for(int j=0;j<n-1;j++) { //n-1번 반복 => n으로 했을 때, 인덱스 초과 오류!
                if(arr[j+1].startsWith(arr[j])) {
                    result[i]="NO"; //일관성 없기 때문, i번째 테스트케이스에 대한 결과값 저장
                    break; //하나라도 같다면 더이상 반복문을 수행하지 않도록!
                }
             }  
        }
			
		for (int i=0; i<result.length; i++) {//배열을 출력하는 방법
				
            System.out.println(result[i]=="NO"?"NO":"YES"); //각 테스트케이스에 대한 결과값 출력
		}
		
		br.close();
	
		
		/*String str="";
		String number="";
		String[] result = new String[t];
				
		for(int i=0; i<t; i++) {
			
			int n = Integer.parseInt(bf.readLine());
			
			for(int j=0; j<n; j++) {
				
				str = bf.readLine();
				number = str.substring(0,str.length()); //->런타임에러가 발생, 왜냐하면 문자가 하나 또는 두 개일 경우가 발생하기 때문
			    number += number + "\n";
			}
			 
			if(number.contains("911")){ //911이 하나만 있을 때도 고려해야 할까?
				
				result[i]="NO";
								
			}
			else {
				
				result[i]="YES";
				//System.out.println("YES");
				
			}
			
		}
		
		for (int i=0; i < result.length; i++) {
			
			System.out.println(result[i]);

		//System.out.println(result); ->안된다! 배열 출력하는 2가지 방법! 1.반복문 2. Arrays.toString(arr)이용			
		}
		
		bf.close();*/
	}
}


	
	


