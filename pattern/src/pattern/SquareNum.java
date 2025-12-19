package pattern;
import java.util.Scanner;

public class SquareNum {
		 public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
		    System.out.print("Enter n: ");
		    int n = in.nextInt();
//		    for(int i=0;i<n;i++) {
//		    	for(int j=0;j<n;j++) {
//		    		if(i%2==0) {
//		    			System.out.print(j+1);
//		    		}
//		    		else {
//		    			System.out.print(n-j);
//		    		}
//		    	}
//		    	System.out.println();
//		    }
//		    System.out.println();
//		    
//		    for(int i=0;i<n;i++) {
//		    	for(int s=0;s<(n-i)-1;s++) {
//		    		System.out.print(" ");
//		    	}
//		    	for(int j=0;j<i+1;j++) {
//		    			System.out.print(j+1);
//		    		
//		    	}
//		    	System.out.println();
//		    }
		    
		    for(int i=0;i<n;i++) {
		    	int last=n-i;
		    	for(int s=0;s<i;s++) {
		    		System.out.print(" ");
		    	}
		    	for(int j=0;j<n-i;j++) {
		    		System.out.print(last--);
		    	}
		    	System.out.println();
		    }
		    in.close();   
		}	 
}
