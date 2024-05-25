package recursion;

public class Tower_Honai {

	public static void main(String[] args) {
		TOH(3, "S", "D","H");

	}

	private static void TOH(int n, String Src, String Des, String Helper) {
		if (n==0){
			return;
		}
		TOH(n-1,Src,Helper, Des);
		System.out.println("Move "+n+" Disk from "+ Src+" to "+ Des);
		TOH(n-1,Helper,Des,Src);
		
	}

}
