public class AddRecursion{
	public static int add(int n){
		if(n==1){
			return 1;
		}
		else{
			return n+add(n-1);
		}
	}
	public static void main(String[] args){
		System.out.println(add(Integer.parseInt(args[0])));
	}
}