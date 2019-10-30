public class ConditionDemo{
	public static void main(String[] args){
		/*int year = Integer.parseInt(args[0]);
		if(year % 4 == 0 && year % 100!=0){
			System.out.println(year+"是闰年");
		}
		else if(year%400 == 0){
			System.out.println(year+"是闰年");
			
		}
		else{
			System.out.println(year+"不是闰年");
			
		}
		int today = Integer.parseInt(args[0]);
		switch(today){
			case 1:
			System.out.println("今天是星期一");
			break;
			case 2:
			System.out.println("今天是星期二");
			break;
			case 3:
			System.out.println("今天是星期三");
			break;
			default:
			q'q'q'q'qSystem.out.println("不认识的参数");
			break;
		
			
		}*/
	    int sum = 0;
		int c = 0;
		for(int i=1;i<=5;i++){
			sum = 1;
			for(int x=1;x<=i;x++){
				 
				sum *= x;
			
			}
			System.out.println(sum);
			c=sum+c;
		}
		System.out.println(c);
	}
}