package pattern;
import java.util.Scanner;
public class hallowpyramid {

	
		 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter n: ");
	        int n = in.nextInt();

	        for (int i = 0; i < n; i++) {
	            for (int s = 0; s< (n-i)-1; s++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j<(i*2)+1; j++) {
	            	if(j==0||j==(i*2)||i==n-1)
	            		System.out.print("*");
	            	else
	            		System.out.print(" ");            	
	            }
	            System.out.println();
	        }

	        in.close();
	    }




}

