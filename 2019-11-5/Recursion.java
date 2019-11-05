public class Recursion{
	public static int factor(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*factor(n-1);
		}
	}
	public static void main(String[] args){
		System.out.println(factor(Integer.parseInt(args[0])));
	}
}