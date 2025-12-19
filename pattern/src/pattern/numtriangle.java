package pattern;
import java.util.Scanner;
public class numtriangle {

			 public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        System.out.print("Enter n: ");
		        int n = in.nextInt();

//		        for (int i = 0; i < n; i++) {
//		            for (int s = 0; s< (n-i)-1; s++) {
//		                System.out.print(" ");
//		            }
//		            for (int j = 0; j<(i*2)+1; j++) {
//
//		            	if  (j<=i)
//		            		System.out.print(i-j);
//		            	else if  (j>i)
//		            		System.out.print(j-i);
//		            	
//		            }
//		            System.out.println();
//		        }
		       
		        for (int i = 0; i < n; i++) {
		        	 int temp=i;
		        	 	        	 
		            for (int s = 0; s< (n-i)-1; s++) {
		                System.out.print(" ");
		            }
		            for (int j = 0; j<(i*2)+1; j++) {
//		            	if(j>=i)
//		            		System.out.print(temp++);
//			        	 else
//		            		System.out.print(temp--);
		            	System.out.print(Math.abs(temp--));
		            	
		            }
		            System.out.println();
		        }
		        in.close();
		    }

}
