package basic;

import java.util.Scanner;

public class RotateNo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int r=scn.nextInt();
		
//		Number of digit in a Num
		int nod=0;
		int temp=num;
		while(temp!=0){
			temp=temp/10;
			nod++;
		}
		r=r%nod;
		int div=(int)Math.pow(10,r);
		int rem=num%div;
		int quo=num/ div;
		System.out.println(rem);
		System.out.println(quo);
		System.out.println(nod);
		
		int ne=rem*(int)Math.pow(10,nod-r)+quo;
		System.out.println(ne);
		
scn.close();
	}

}
