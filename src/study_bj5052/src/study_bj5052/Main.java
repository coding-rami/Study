package study_bj5052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//1.�׽�Ʈ���̽� ���� t
		//2.��ȭ��ȣ�� �� n
		//3.��ȭ��ȣ.length <=10, �ߺ�x
		//����� ���ۻ��!
		//4.��ȭ��ȣ���� �ϰ��� ���ٸ�(��ģ�ٸ�) no, �ϰ��� �ִٸ� yes ���
		 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		String[] result = new String[t]; //�� �׽�Ʈ���̽����� yes,no �� ����
		
		for(int i=0;i<t;i++) { //t���� �׽�Ʈ���̽�
	          
			int n = Integer.parseInt(br.readLine()); 
	        String[] arr = new String[n];
	                   
	            
	        for(int j=0;j<n;j++) { //n���� ��ȭ��ȣ
	              
	            	arr[j]=br.readLine();
	           
	         }

	        Arrays.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);                    
                }
            }); //���������� ���� ex)911,91125426,97625999 ...
            
            for(int j=0;j<n-1;j++) { //n-1�� �ݺ� => n���� ���� ��, �ε��� �ʰ� ����!
                if(arr[j+1].startsWith(arr[j])) {
                    result[i]="NO"; //�ϰ��� ���� ����, i��° �׽�Ʈ���̽��� ���� ����� ����
                    break; //�ϳ��� ���ٸ� ���̻� �ݺ����� �������� �ʵ���!
                }
             }  
        }
			
		for (int i=0; i<result.length; i++) {//�迭�� ����ϴ� ���
				
            System.out.println(result[i]=="NO"?"NO":"YES"); //�� �׽�Ʈ���̽��� ���� ����� ���
		}
		
		br.close();
	
		
		/*String str="";
		String number="";
		String[] result = new String[t];
				
		for(int i=0; i<t; i++) {
			
			int n = Integer.parseInt(bf.readLine());
			
			for(int j=0; j<n; j++) {
				
				str = bf.readLine();
				number = str.substring(0,str.length()); //->��Ÿ�ӿ����� �߻�, �ֳ��ϸ� ���ڰ� �ϳ� �Ǵ� �� ���� ��찡 �߻��ϱ� ����
			    number += number + "\n";
			}
			 
			if(number.contains("911")){ //911�� �ϳ��� ���� ���� ����ؾ� �ұ�?
				
				result[i]="NO";
								
			}
			else {
				
				result[i]="YES";
				//System.out.println("YES");
				
			}
			
		}
		
		for (int i=0; i < result.length; i++) {
			
			System.out.println(result[i]);

		//System.out.println(result); ->�ȵȴ�! �迭 ����ϴ� 2���� ���! 1.�ݺ��� 2. Arrays.toString(arr)�̿�			
		}
		
		bf.close();*/
	}
}


	
	


