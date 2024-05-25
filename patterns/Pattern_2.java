package patterns;
import java.util.Scanner;


public class Pattern_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n= scn.nextInt();
		int i=1;
		int nst=1;
		while(i<=n){
			
			for(int col=1;col<=nst;col++){
				System.out.print("* ");
			}
			i++;
			nst++;
			System.out.println();
		}
		scn.close();
		

	}

}
