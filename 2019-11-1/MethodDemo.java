public class MethodDemo{
	public static double sub(double a, double b){
		return a-b;
	}
	
	public static void main(String[] args){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double r = sub(a,b);
		System.out.println(r);
	}
	// public static int jiecheng(int a){
		// int jiecheng = 1;
		// for(int i=1;i<=a;i++){
			
			// jiecheng *= i;
		// }
		// return jiecheng;
	// }
	// public static int sum(int x){
		// int sum = 0;
		// for(int y=1;y<=x;y++){
			// sum += jiecheng(y);
		// }
		// return sum;
	// }
	// public static void main(String[] args){
		// System.out.println(sum(Integer.parseInt(args[0])));
	// }
	
}


