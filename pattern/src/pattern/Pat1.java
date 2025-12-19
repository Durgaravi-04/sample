package pattern;

import java.util.Scanner;

public class Pat1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=in.nextInt();
		
		for(int i=1;i<=n;i++) {
			for( int s=0;s<(n-i);s++) {
				
				System.out.print("  " );
			}
			for( int j=0;j<i;j++) {
				
				System.out.print("* " );
			}
			System.out.println();
		}
		in.close();
	}


}
