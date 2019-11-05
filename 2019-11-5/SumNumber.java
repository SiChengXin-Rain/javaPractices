public class SumNumber{
        // public static void sumNumber(int n) {
	// if (n < 10) {
			// System.out.printf("%d ", n);
		// } else {
			//除了最低位之外，进行递归
			// int m = n / 10;
			// sumNumber(m);
			//打印最低位
			// int o = n % 10;
			// System.out.printf("%d ", n);
		// }

	// }
	public static int sumNumber(int n) {
		if (n < 10) {
			return n;
		} else {
			int m = n / 10;
			sumNumber(m);
			int o = n % 10;
			
		
			return n;
		}
	}

	public static void main(String[] args) {
		System.out.println(sumNumber(9527));

		
	   //sumNumber(1234);
	
	}
}


