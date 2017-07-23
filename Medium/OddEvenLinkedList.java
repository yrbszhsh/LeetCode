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
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        while (head.next.next != null) {
            ListNode temp = head.next.next;
            ptr1.next = temp;
        }
    }
}