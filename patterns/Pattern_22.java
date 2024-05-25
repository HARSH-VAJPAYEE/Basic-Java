package patterns;

public class Pattern_22 {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		int nst=n;
		int nsp=-1;
		while(i<=n){
			for(int j=1;j<=nst;j++){
				System.out.print("* ");}
			for(int j=1;j<=nsp;j++){
				System.out.print("  ");}
			int j=1;
			if(i==1){
				j=2;
			}
			for(;j<=nst;j++){
				System.out.print("* ");}
			System.out.println();

			
			
		
				nst--;
				nsp=nsp+2;
			i++;
			
				
		
		}

	}

}
