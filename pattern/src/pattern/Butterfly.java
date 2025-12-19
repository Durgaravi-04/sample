package pattern;
import java.util.Scanner;
public class Butterfly {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<(n*2)-1;i++) {
			if(i<=((n*2)-1)/2) {
				for(int j=0;j<i+1;j++) {
					System.out.print("*");
				}
				for(int s=0;s<((n-1)*2-(i*2));s++) {
					System.out.print(" ");
				}
				for(int k=0;k<i+1;k++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=0;j<((n*2)-1-i);j++) {
					System.out.print("*");
				}
				for(int s=0;s<(i*2)-((n*2)-2);s++) {
					System.out.print(" ");
				}
				for(int k=0;k<(((n*2)-1)-i);k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		in.close();
	}

}
