package patterns;

public class Pattern_10 {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		int nst=2*n-1;
		int nsp=0;
		while(i<=n){
			for(int j=1;j<=nsp;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=nst;j++){
				System.out.print("* ");
			}
			
			System.out.println();
			i++;
			nst=nst-2;
			nsp++;
		}

	}

}
