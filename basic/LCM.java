package basic;
import java.util.Scanner;


public class LCM {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num1=scn.nextInt();
		int num2= scn.nextInt();
		int GCD;
		int n1=num1;
		int n2=num2;
//	Approach 1	
//	num1*num2=lCM*GCD
     while(true){
    	 int temp=n1%n2;
    	 if(temp==0){
    		 GCD=n2;
    		 break;
    	 }
    	 n1=n2;
    	 n2=temp;
     }
     int num=num1 * num2;
     int LCM= num1* num2/GCD;
     System.out.println(num);
     System.out.println(GCD);
     System.out.println(LCM);
     scn.close();
	}

}
