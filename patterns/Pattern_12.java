package patterns;

public class Pattern_12 {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		int nst=1;
		int nsp=n-1;
		while(i<=n){
			for(int j=1;j<=nsp;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=nst;j++){
				if(j%2==0){
				System.out.print("  ");
			}else {
				System.out.print("* ");
				
			}}
			
			System.out.println();
			i++;
			nst=nst+2;
			nsp--;
		}

	}

}
