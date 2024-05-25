package patterns;
import java.util.Scanner;
public class Pattern_32 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n= scn.nextInt();
		int i=1;
		int nst=1;
		int c=1;
		while(i<=2*n-1){
			for(int j=1;j<=nst;j++){
				if(j%2==0){
					System.out.print("0  ");
				}else{
					System.out.print(c+"  ");
				}}
				System.out.println();
				i++;
				if(i<=n){
					nst+=2;
					c++;
				}else{
					nst-=2;
					c--;
				}
			}scn.close();
		}
		

	}


