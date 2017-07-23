/**
 * RemoveLinkedListElements
 */
public class RemoveLinkedListElements {

    public RemoveLinkedListElements () {
        
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        ListNode result = new ListNode(head.val);
        ListNode p =result;
        while(head != null) {
            while (head != null && head.val == val) {
                head = head.next;
            }
            if(head != null){
                p.next = new ListNode(head.val);
                p = p.next;
                head = head.next;
            }
        }
        return result.next;
    }
    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(1);
        L.next.next = new ListNode(2);
        L.next.next.next = new ListNode(3);
        L.next.next.next.next = new ListNode(3);
        RemoveLinkedListElements r = new RemoveLinkedListElements();
        ListNode result = r.removeElements(L,1);
        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);
    }
}