package patterns;

public class Pattern_7 {

	public static void main(String[] args) {
		
		int n = 9;

		int row=1;
		while(row<=n){
			for(int col=1;col<=n;col++ ){
				
				if(row==1||row==n||col==1||col==n){
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
