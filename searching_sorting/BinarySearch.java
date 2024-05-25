package searching_sorting;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = new int[]{-5,-3,-1, 0, 1, 3, 5};
		int find=0;
		int length= array.length;
        int low=0;
        int high=length-1;
		int val=BinarySearchf(array,find, low, high);
        if (val== -1){
        	System.out.println(" Not found");
        }else {
        	System.out.println(find+ " found at indesx  "+ val);
        }
        
        
        
        
	}

	private static int BinarySearchf(int[] array, int find, int low , int high) {
        
        while(high>=low){
        	 int mid = (low +high)/2;
        	 if (array[mid]==find){
             	return mid;
             }else if (array[mid] >find ){
             		high=mid-1;
             		return BinarySearchf(array,find , low , high);
             	}
             else {
             		low=mid+1;
             		return BinarySearchf(array,find , low , high);
             	}
             
        	 
        }return -1;
	
       
        
		
	}

}
