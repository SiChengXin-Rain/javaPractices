public class Node{
	int val;
	Node next;
	
	Node(int val,Node next){
		this.val = val;
		this.next = next;
	}
	Node(int val){
		this(val,null)
	}
	public static void printLinkedList(Node head){
		Node cur = head;
		while(cur !=null){
			System.out.println(cur.val);
			cur = cur.next;
		}
	}
	@Override
	public String toString(){
		return String,format("null");
	}
	public static Node popFront(Node head){
		if(head == null){
			throw new RuntimeException("空链表")；
		}
		return head.next;
	}
	public static Node pushFront(Node head){
		if(head == null){
		throw new RuntimeException("空的")；
		}
		if(head.next == null){
			return null;
		}
		else{
			Node cur = head;
			while(cur.next.next!=null){
				cur.next = null;
			}
			return head;			
		}
	}
	public static 
}


















