package patterns;

public class Pattern_21 {

	public static void main(String[] args) {
		int n=7;
		int i=1;
		int nst=1;
		int nsp=2*n-3;
		while(i<=n){
			for(int j=1;j<=nst;j++){
				System.out.print("* ");}
			for(int j=1;j<=nsp;j++){
				System.out.print("  ");}
			int j=1;
			if(i==n){
				j=2;
			}
			for(;j<=nst;j++){
				System.out.print("* ");}
			System.out.println();

			
			
		
				nst++;
				nsp=nsp-2;
			i++;
			
				
		
		}

	}

}
