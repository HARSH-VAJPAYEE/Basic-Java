package patterns;
import java.util.Scanner;

public class Pattern_6 {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		int nsp=0;
		int nst=n;
		int j=1;
		while(j<=n){
//			Work 
//			space 
			for(int i=1;i<=nsp;i++){
				System.out.print("  ");
			}
			for(int i=1;i<=nst;i++){
				System.out.print("* ");
			}
//			update
			System.out.println();
			j++;
			nsp=nsp+2;
			nst--;
		}scn.close();
	}

}
