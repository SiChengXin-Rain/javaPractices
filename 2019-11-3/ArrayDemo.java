public class ArrayDemo{
	public static int max(int[] a){
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
		if(max<a[i]){
			max = a[i];
		}
		}
		return max;
	}
	public static double average(int[] b){
		int average = b[0];
		int sum = 0;
		for(int i = 0;i <b.length;i++){
			sum +=b[i];
		}
		return (double)sum/(b.length);
	}
	public static void main(String[] args){
			int[] a = {1, 2, 3,4}; 
			int[] b = {2,4,6,8};
			System.out.println("最大值为"+max(a));
			System.out.println("平均值为"+average(b));

	}
}