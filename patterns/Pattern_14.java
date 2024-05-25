package patterns;

public class Pattern_14 {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		int nst=1;
		int nsp=n-1;
		while(i<=2*n-1){
			for(int j=1;j<=nsp;j++){
				System.out.print("  ");}
			
			for(int j=1;j<=nst;j++){
				System.out.print("* ");}
			System.out.println();

			
			
			if(i<n)
			 {nst=nst+1;
			 nsp=nsp-1;}
			else{
				nst--;
				nsp++;
			}i++;
			
				
		
		}

	}

}
