public class Main{
	public static void main(String[] args){
		Person p = new Person();
		p.name = "杨玉婷";
		p.sayHello("大肥猪");
	}
}
 class Person{
	 //属性
	 String name;
	 
	 //方法（普通方法）
	 public void sayHello(String target){
		 System.out.println(name+"是头"+target);
	 }
 }
 //构造器
 //长得像方法，但1.方法名称必须和类名称相同 2.不能有返回值类型
  //用来做对象的初始化（初始化属性）
 public Person(){
	 name = "秘密";
	 age = -1;
 }
 
 //构造器的重载
 public Person(String n ,int a){
	 name = n;
	 age = a;
	 
 }