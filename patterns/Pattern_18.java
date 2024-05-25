package patterns;

public class Pattern_18 {

	public static void main(String[] args) {
		int n=7;
		int i=1;
		int nst=1;
		int nsp=n/2;
		while(i<=n){
			for(int j=1;j<=nsp;j++){
				System.out.print("  ");}
			
			for(int j=1;j<=nst;j++){
				System.out.print("* ");}
			System.out.println();
		

			
			
			if(i<=n/2)
			 {nst=nst+2;
			 nsp=nsp-1;}
			else{
				nst=nst-2;
				nsp=nsp+1;
			}i++;
			
				
		
		}

	}

}
