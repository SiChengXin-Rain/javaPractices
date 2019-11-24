public class Solution {

    public Node middleNode(ListNode head){
        Node fast = head;
        Node slow = head;
        while(fast !=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return  slow;
    }
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
    public boolean chkPalindrome(ListNode A) {
        ListNode middle = middleNode(A);
        ListNode rHead = reverseList(middle);
        ListNode c1 = A;
        ListNode c2 = rHead;

        while (c1 != null && c2 != null) {
            if (c1.val != c2.val) {
                return false;
            }

            c1 = c1.next;
            c2 = c2.next;
        }

        return true;
    }




}
































