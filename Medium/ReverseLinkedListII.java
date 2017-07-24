/**
 * ReverseLinkedListII
 */
public class ReverseLinkedListII {

    public ReverseLinkedListII () {
        
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

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode ptr = sentinel;
        while (m != 1) {
            slow = slow.next;
            ptr = ptr.next;
            m = m-1;
        }
        while (n != 1) {
            fast = fast.next;
            n = n-1;
        }
        ListNode ptr1 = fast.next;
        ListNode tail = new ListNode(0);
        ListNode ptr2 = tail;
        while(ptr1 != null){
            ptr2.next = new ListNode(ptr1.val);
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        fast.next = null;
        ListNode mid = reverseList(slow);
        ptr.next = mid;
        slow.next = tail.next;
        return sentinel.next;
    }

    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(2);
        L.next.next = new ListNode(3);
        //L.next.next.next = new ListNode(1);
        ReverseLinkedListII test = new ReverseLinkedListII();
        L = test.reverseBetween(L,1,3);
        System.out.println(L.val);
        System.out.println(L.next.val);
        System.out.println(L.next.next.val);
        //System.out.println(L.next.next.next.val);
    }
}