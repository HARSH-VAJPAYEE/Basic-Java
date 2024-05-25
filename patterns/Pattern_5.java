package patterns;
import java.util.Scanner;


public class Pattern_5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n= scn.nextInt();
		int i=1;
		int nst=n;
		int nsp=0;
		while(i<=n){
			for(int col=1;col<=nsp;col++){
				System.out.print("  ");
			}
			
			for(int col=1;col<=nst;col++){
				System.out.print("* ");
			}
			i++;
			nst--;;
			nsp++;
			System.out.println();
		}
		
		scn.close();
	}

}
