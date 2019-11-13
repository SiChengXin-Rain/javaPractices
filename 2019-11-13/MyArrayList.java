import java.util.Arrays;
//顺序表中存储的元素类型是int型
public class MyArrayList{
	private int[] array;
	private int size;
	
	public MyArrayList(){
		array = new int[10];
		size = 0;
	}
	//尾插
	//时间复杂度O(1)
	//空间复杂度O(1)
	public void pushBack(int element){
		array[size++]=element;
	}
	//尾删
	//时间复杂度O(1)
	//空间复杂度O(1)
		public void popBack(){
		array[--size]=0;
	}
	//i代表空心
	public void pushFront(int element){
		for(int i = size;i>=1;i--){
			array[i]=array[i-1];
		}
		array[0]=element;
		size++;
	}
	public void insert(int element,int index){
		for(int i = size-1;i>=index;i--){
			array[i+1]=array[i];
		}
		array[index]=element;
		size++;
	}
	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOf(array,size));
}
public static void main(String[] args){
	MyArrayList list = new MyArrayList();
	list.pushBack(1);
	list.pushBack(2);
	list.pushBack(3);
	list.pushFront(10);
	list.pushFront(20);
	list.pushFront(30);
	list.insert(666,1);
	System.out.println(list);
}
}