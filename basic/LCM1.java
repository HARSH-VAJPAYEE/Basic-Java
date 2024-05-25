package basic;
import java.util.Scanner;


public class LCM1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num1=scn.nextInt();
		int num2= scn.nextInt();
//	Approach 2	
//	find max(a,b) then loop start with max num and work until a*b and incremented by max
		
//		 Find maximum btw num1 and num2
    int a= (num1>num2)? num1:num2;
    int b= Math.max(num1, num2);
//    Loop from a to num1*num2 and incremented by a
    int i;
    for (i=b;i<num1*num2;i=i+a){
    	if(i%num1==0&&i%num2==0){
    		break;
    	}
    }System.out.println(i);
    System.out.print(a==b);
    scn.close();
    
	}
	

}
