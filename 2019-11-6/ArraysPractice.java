import java.util.Arrays;
public class ArraysPractice{
	public static void swap(int[] a,int i,int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static void bubblesort(int[] a){
		for(int i=0;i<a.length-1;i++){
			 for(int x=0;x<a.length-i-1;x++){
				 if(a[x]>a[x+1]){
					 swap(a,x,x+1);
				 }
			 }
		}
	}
	public static void main(String[] args){
		int[] a={9,5,4,2,6,7};
		bubblesort(a);
		System.out.println(Arrays.toString(a));
	}
}