package patterns;

public class Pattern_13 {

	public static void main(String[] args) {
		int n=4;
		int i=1;
		int nst=1;
		while(i<=2*n-1){
			for(int j=1;j<=nst;j++){
				System.out.print("* ");}
			System.out.println();
//			if update row first then check i for n+1;
//			else update row at last and check i with n only ;
//			 we are not using equal to n because we are updating value for next step ;
//			if we update the value with equal to n then 6th row is incremented ;
			
			i++;
			if(i<n+1)
			 {nst=nst+1;}
			else{
				nst--;
			}
			
				
		
		}

	}

}
