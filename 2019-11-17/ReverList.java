public class ReverseList{
	public Node reverseList(Node head){
		Node p1 = null;
		Node p2 = head;
		while(p2!=null){
			Node p3 = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = p3;
		}
		return p1;
	}
}