/**
 * RemoveNthNodeFromEndofList
 */
public class RemoveNthNodeFromEndofList {

    public RemoveNthNodeFromEndofList () {
        
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while (n != 0) {
            ptr1 = ptr1.next;
            n = n-1;
        }
        if (ptr1 == null) {
            return head.next;
        } else {
            while(ptr1.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
            }
            ptr2.next = ptr2.next.next;
            return head;
        }
    }
    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(2);
        L.next.next = new ListNode(3);
        L.next.next.next = new ListNode(1);
        RemoveNthNodeFromEndofList test = new RemoveNthNodeFromEndofList();
        L = test.removeNthFromEnd(L, 4);
        System.out.println(L.val);
        System.out.println(L.next.val);
        System.out.println(L.next.next.val);
    }
}