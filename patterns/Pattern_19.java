package patterns;

public class Pattern_19 {

	public static void main(String[] args) {
		int n=7;
		int i=1;
		int nst=n/2+1;
		int nsp=-1;
		while(i<=n){
		
			for(int j=1;j<=nst;j++){
				System.out.print("* ");}
			for(int col=1;col<=nsp;col++){
				System.out.print("  ");}
			
			int j=1;
			if(i==1||i==n){
				j=2;
			}
			for(;j<=nst;j++){
				System.out.print("* ");}
			System.out.println();

			
			
			if(i<=n/2)
			 {nst=nst-1;
			 nsp=nsp+2;}
			else{
				nst++;
				nsp=nsp-2;
			}i++;
			
				
		
		}

	}

}
