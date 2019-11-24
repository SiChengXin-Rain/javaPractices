public class Partition {
    private static Node partition(Node head, int x){
        Node 小链表的头节点 = null;
        Node 小链表的尾节点 = null;
        Node 大链表的头节点 = null;
        Node 大链表的尾节点 = null;


        Node cur = head;
        while(cur != null){
            if(cur.val<x){
                if(小链表的头节点==null){
                    小链表的头节点 = cur;
                }
            }
        }


    }
}
