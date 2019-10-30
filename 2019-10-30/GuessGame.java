import java.util.Scanner;
import java.util.Random;

public class GuessGame {
     public static void main(String[] args){
	    Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎进入猜数字游戏");
		int n = random.nextInt(100);
		System.out.println("数字已生成");
		int times = 4;
		for(int i = 1;i<=times;i++){
			System.out.print(">");
			int x = scanner.nextInt();
			if (x == n){
				System.out.println("猜测成功，用了"+i+"次机会");
				return;
			}
			else if(x<n){
				System.out.println("第"+i+"次猜测，猜小了");
			}
			else{
				System.out.println("第"+i+"次猜测，猜大了");
			}
		}
		System.out.println("很遗憾，Game over");
		System.out.println("数字其实是"+n);
    }
}