package array;

public class WaveDispalydowntoup {

	public static void main(String[] args) {
		int row=4;
		int col=4;
		int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int c=0;c<arr[0].length;c++){
			if(c%2==0){
				for(int r=0;r<arr.length;r++){
					System.out.print(arr[r][c]+"  ");
				}
			}else {
				for(int r=arr.length-1;r>=0;r--){
					System.out.print(arr[r][c]+"  ");
			}
		}
		
		
		

	}

	}}
