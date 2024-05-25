package patterns;

public class Pattern_8 {

	public static void main(String[] args) {
//		 This code can't run for Even inputs 
		int n = 9;

		int row=1;
		while(row<=n){
			for(int col=1;col<=n;col++ ){
				if(row==col||col+row==n+1){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
			row++;
		}
		

	}

}
