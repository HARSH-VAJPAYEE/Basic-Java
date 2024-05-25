package basic;
import java.util.Scanner;


public class GCD {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num1=scn.nextInt();
		int num2= scn.nextInt();
		
		while(true){
			int temp=num1%num2;
			if(temp==0){
				System.out.println(num2);
				break;
			}
			num1=num2;
			num2=temp;
		}scn.close();

	}

}
