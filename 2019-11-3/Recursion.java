public class Recursion{
	public static int sum(int n){
		if(n<10){
			return n;
		}
		else{
			int m = n/10;
			int o = n%10;
			int h = sum(m);
			int r = h+o;
			return r;
		} 
			
	}
	public static void main(String[] args){
		sum(9527);
	}
}
// public class Recursion{
	// public static int jump(int n,){
		// if(n==1){
			// return 1;
			
		// }
		// else{
			// return (jump(n-1)+jump(n-2));
		// }
	// }
// }