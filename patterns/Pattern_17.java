package patterns;

public class Pattern_17 {

	public static void main(String[] args) {
		int n=7;
		int i=1;
		int nst=n/2;
		int nsp=1;
		while(i<=n){
			for(int j=1;j<=nst;j++){
				System.out.print("* ");}
			for(int j=1;j<=nsp;j++){
				System.out.print("+ ");}
			
			for(int j=1;j<=nst;j++){
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
