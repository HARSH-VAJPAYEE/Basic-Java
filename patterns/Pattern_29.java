package patterns;

public class Pattern_29 {
	public static void main(String[] args) {
		int n=5;
		int nsp=n-1;
		int nst=1;
		int i=1;
	
		while(i<=5){
//			int count =i;
			for(int j=1;j<=nsp;j++){
				System.out.print("	");
			}for(int j=1;j<=nst;j++){
				if(j==1 || j==nst)
				System.out.print(i+"	");
				else
					System.out.print("0	");
				
				
			}
			System.out.println();
			i++;
			nst+=2;
			nsp--;
			
		}
	}

}
