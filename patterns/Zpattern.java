package patterns;

import java.util.Scanner;

public class Zpattern {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int i=0;
		int tsp=0;
		int tst=n;
		while(i<n){
			for(int j=0;j<tsp;j++){
				System.out.print("  ");
			}
			for(int j=0;j<tst;j++){
				System.out.print("* ");
			}
			i++;
			System.out.println();
			if(i==0 || i==n-1){
				tsp=0;
				tst=n;
				
			}else{
				tsp=n-i-1;
				tst=1;
			}
			
			
		}

	}

}
