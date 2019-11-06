public class BinarySearch{
	public static int binarysearch(int[] a,int value){
		int left = 0;
		int right = a.length-1;
		while(left<=right){
			
		int	mid = (left+right)/2;
			if(value<a[mid]){
				right = mid-1;
			}
			else if(value>a[mid]){
				left = mid+1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {     
	int[] a = {1,2,3,4,5,6};     
	System.out.println(binarysearch(a, 6)); 
	} 
}