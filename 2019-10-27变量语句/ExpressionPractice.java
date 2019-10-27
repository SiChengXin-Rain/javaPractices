public class ExpressionPractice{
	public static void main(String[] args){
		int n = 137;
		System.out.println((n >> 2) & 0x7);
		int mask = ~(0x7<<2);
		System.out.println(n & mark);
	}
}