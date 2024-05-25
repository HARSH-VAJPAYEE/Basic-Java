package patterns;

public class Pattern_25 {
	public static void main(String[] args) {
		int n=5;
		int nsp=n-1;
		int nst=1;
		int i=1;
		int count=1;
		while(i<=5){
			for(int j=1;j<=nsp;j++){
				System.out.print("	");
			}for(int j=1;j<=nst;j++){
				System.out.print(count+"	");
				count++;
			}
			System.out.println();
			i++;
			nst+=2;
			nsp--;
			
		}
	}

}
