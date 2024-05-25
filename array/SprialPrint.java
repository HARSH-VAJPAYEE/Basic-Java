package array;

public class SprialPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = { {  1,  2,  3,  4,  5,  6 },
				        {  7,  8,  9, 10, 11, 12 }, 
				        { 13, 14, 15, 16, 17, 18 },
			            { 19, 20, 21, 22, 23, 24 }, 
			            { 25, 26, 27, 28, 29, 30 } };
		spiralDisplay(arr);

	}
	public static void spiralDisplay(int[][] arr) {

	int count =0;
	int total = arr.length * arr[0].length;
	int minrow=0;
	int maxrow=arr.length-1;
	int mincol=0;
	int maxcol=arr[0].length-1;
	while (count< total){
		// First col
		for(int r=minrow;r<=maxrow&& count<total;r++){
			System.out.print(arr[r][mincol]+"  ");
			count++;
		}minrow++;
//		 last col
		for(int c=mincol;c<=maxcol&& count<total;c++){
			System.out.print(arr[maxrow][c]+"  ");
			count++;
		}mincol++;
//		last row
		for(int r=maxrow;r>=minrow&& count<total;r--){
			System.out.print(arr[r][maxcol]+"  ");
			count++;
		}maxrow--;
		//
		for(int c=maxcol;c>=mincol&& count<total;c--){
			System.out.print(arr[minrow][c]+"  ");
			count++;
		}maxcol--;
		
		
		
		
	}
	
	
	
	}


}
