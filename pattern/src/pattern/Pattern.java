package pattern;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.print("Enter n: ");
	        int n = in.nextInt();
	        for(int i=0;i<(n*2)-1;i++) {
	        	if(i<=((n*2)-1)/2) {
		        	for(int s=0;s<(n*i)-(i*2)+1;s++) {
			        		System.out.print("-");
			        	}
		        	for(int j=0;j<(n*2)-(i*2)-1;j++) {
		        		System.out.println("* ");
		        	}
	        	}
	        	else {
	        		for(int s=0;s<(n*2)-(i*2)+1;s++) {
		        		System.out.print("-");
		        	}
		        	for(int j=0;j<(n*2)-(i*2)+1;j++) {
		        		System.out.print("* ");
		        	}
	        	}
	        	System.out.println();
	        }
	        
	        
	        
	        
	        
//	        for (int i = 0; i < n; i++) {	        	  
//	            for (int s = 0; s< (n-i)-1; s++) {
//	                System.out.print(" ");
//	            }
//	            for (int j = 0; j<(i*2)+1; j++) {
//	            	System.out.print("*");
//	            }
//	            System.out.println(" ");
//	          }
	        in.close();
	}

}
