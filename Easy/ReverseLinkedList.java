/**
 * ReverseLinkedList
 */
public class ReverseLinkedList {

    public ReverseLinkedList () {
        
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = p;
            p = head;
            head = temp;
        }
        return p;
    }
    public static void main(String[] args) {
        ReverseLinkedList r = new ReverseLinkedList();
        ListNode L = new ListNode(1);
        L.next = new ListNode(2);
        L.next.next = new ListNode(3);
        L = r.reverseList(L);
        System.out.println(L.val);
        System.out.println(L.next.val);
        System.out.println(L.next.next.val);
    }
}