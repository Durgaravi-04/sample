package pattern;

import java.util.Scanner;

public class numpat {
		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter n: ");
	        int n = in.nextInt();

//	        for (int i = 0; i < n; i++) {
//	        	 for (int j = 0; j <n; j++) {
//	                 System.out.print(j+1);
//	             }
//	        	 System.out.println();
//	        }
	        
	        
//	        for (int i = 0; i < n; i++) {
//	        	 for (int j = 0; j <n; j++) {
//	                 System.out.print(i+1);
//	             }
//	        	 System.out.println();
//	        }
	        
	        

//	        for (int i = 0; i < n; i++) {
//	        	 for (int j = 0; j <n; j++) {
//	        		 
//	                 System.out.print((i+j-1)+2);  
//	             }
//	        	 System.out.println();
//	        }
	        
	        						                                                                                    //here don't change j=0 so refer below code
//	        int i=0,j=0;
//	        for ( i = 0; i < n; i++) {
//	        	 for (j = i; j <n; j++) {
//	        		 
//	                 System.out.print(j+1);  
//	             }
//	        	 for(int s=0;s<i;s++) {
//	        		 System.out.print(s+1); 
//	        	 }
//	        	 System.out.println();
//	        }
	        

	        for (int i = 0; i < n; i++) {
	        	 for (int j = 0; j <n; j++) {
	        		 if(i+j+1>n)
	        			 System.out.print((i+j+1)-n); 
	        		 else
	        			 System.out.print(i+j+1); 
	             }
	        	 
	        	 System.out.println();
	        }

	        
	        
	        
	        
	        in.close();
		 }
	}