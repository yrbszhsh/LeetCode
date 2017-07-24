/**
 * OddEvenLinkedList
 */
public class OddEvenLinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public OddEvenLinkedList () {
        
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(2);
        L.next.next = new ListNode(3);
        L.next.next.next = new ListNode(1);
        OddEvenLinkedList test = new OddEvenLinkedList();
        L = test.oddEvenList(L);
        System.out.println(L.val);
        System.out.println(L.next.val);
        System.out.println(L.next.next.val);
        System.out.println(L.next.next.next.val);
    }
}