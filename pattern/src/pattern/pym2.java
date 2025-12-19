package pattern;
import java.util.Scanner;
public class pym2 {

	
		 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter n: ");
	        int n = in.nextInt();

	        for (int i = n; i >=1; i--) {
	            for (int s = 0; s<n- i; s++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j<(i*2)-1; j++) {//j=2(
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        in.close();
	    }




}
