package patterns;
import java.util.Scanner;
public class Pattern_20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn .nextInt();
		int i=1;
		int nsp=n/2;
		int nst=1;
		while(i<=n){
			for(int j=1;j<=nsp;j++){
				System.out.print("  ");
			}for(int j=1;j<=nst;j++){
				if(j==1||j==nst)
				System.out.print("* ");
				else{
					System.out.print("  ");
				}
				
			}System.out.println();
			if(i<=n/2){
				nsp--;
				nst=nst+2;
			}else{
				nsp++;
				nst-=2;
			}
			i++;
			scn.close();
		}
		

	}

}
