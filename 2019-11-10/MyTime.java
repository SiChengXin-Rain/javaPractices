public class MyTime{
	private int hour = 24;
	private int minute = 59;
	private int second = 59;
	
	public MyTime(int hour,int minute,int second){
	if(hour < 1 || hour > 24){
		System.out.println("不支持的小时");
		return;
	}
	if(minute < 0|| minute>59){
		System.out.println("不支持的分钟");
		return;
	}
	if(second < 0|| second>59){
		System.out.println("不支持的秒");
		return;
	}
	this.hour = hour;
	this.minute = minute;
	this.second = second;
	}
	@Override
	public String toString(){
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	public void add(int seconds){
		if(seconds<0){
			System.out.println("请使用sub");
			return;
		}
		second += seconds;
		while(second>59){
			second -=60;
			minute+=1;
			if(minute>59){
				hour+=1;
				minute =0; 
			}
			if(hour>24){
				hour = 1;
			}
		}
		
		
		
	}
	public void sub(int seconds){
		second-=seconds;
 		while(second<0){
			minute-=1;
			second =60+second;
		}
		if(minute<0){
			hour-=1;
			minute = 60+minute; 
		}
		if(hour<1){
			hour = 24;
		}
	}
	public static void main(String[] args){
		MyTime time = new MyTime(01,00,29);
		System.out.println(time);
		time.sub(40);
		System.out.println(time);
	
	}
	
	
	
}