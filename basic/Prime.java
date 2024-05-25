package basic;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a= scn.nextInt();
		int i=2;
		int count=0;
//		type cast double into int 
		
		int s=(int)(Math.sqrt(a));
		while(i< s){
			if(a%i==0){
				count++;
				break;
			}	
			
			i++;
		}
		if(count==0){
			System.out.println("Prime");
		}else{
			System.out.println("NOt Prime/ Composite ");
		}scn.close();

	}

}
