package study_bj7567;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 String plate = sc.nextLine();
		 int height = 10;
		
		 
		 for(int i=0; i<plate.length()-1;i++) {
			
			 if(plate.charAt(i)==plate.charAt(i+1)) {
				
				 height+=5;
			 }
			 else {
			
				 height+=10;
			 }
			 
		 }
		 
		 System.out.println(height);
		 sc.close();
	   
	}
}
