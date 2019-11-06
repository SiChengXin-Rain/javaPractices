import java.util.Arrays;
public class CopyOf{
	
	public static int[] copyof(int[] a,int newlength){
		int[] dest = new int [newlength];
		int length = Math.min(newlength,a.length);
		for(int i = 0; i<length;i++){
			dest[i] = a[i];
		}
		return dest;
	}
	public static void main(String[] args){
		int[] a={1,4,6,9,8};
		copyof(a,7);
		System.out.println(Arrays.toString(copyof(a,7)));
	}
}