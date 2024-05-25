package patterns;
import java.util.Scanner;


public class Pattern_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n= scn.nextInt();
		int i=1;
		while(i<=n){
			int nst=n;
			for(int col=1;col<=nst;col++){
				System.out.print("* ");
			}
			i++;
			System.out.println();
		}
		
scn.close();
	}

}
