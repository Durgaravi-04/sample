package pattern;
import java.util.Scanner;
public class SquareStar {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=in.nextInt();
		int i=1,j=1;
		for(i=1;i<=n;i++) {
			for( j=i;j<=n;j++) {
				
				System.out.print(j+" " );
				
				
				//System.out.print(i );
				//System.out.print(j);
				//System.out.print(j);
			}
			System.out.println();
			
		}
		in.close();
	}

}
