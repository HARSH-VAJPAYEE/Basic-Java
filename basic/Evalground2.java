package basic;
import java.util.*;
public class Evalground2
{
    public static void main(String[] args)
    {
       
    	Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;

		int nsp = n - 1;
		int nst = 1;

		int val;

		while (row <= 2*n-1) {

			// as soon as you enter a new row, reset val to 1
			val = 1;

			// 2 work
			// spaces
			for (int csp = 1; csp <= nsp; csp = csp + 1) {
				System.out.print("\t");
			}

			// stars
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				System.out.print(val + "\t");

				if (cst <= nst / 2)
					val = val + 1;
				else
					val = val - 1;
			}

			// changes
			row = row + 1;
			System.out.println();
			if (row>n){
				nsp = nsp + 1;
				nst = nst - 2;
			}else {
				nsp = nsp - 1;
				nst = nst + 2;
			}
			
			
			
			

		}
    }
}
