/**
 * LinkedListCycleII
 */
public class LinkedListCycleII {

    public LinkedListCycleII () {
        
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
	ListNode slow = head, fast = head;
	while(fast != null && fast.next != null) {
		fast = fast.next.next;
		slow = slow.next;
		if (slow == fast) {
			while (head != slow) {
				head = head.next;
				slow = slow.next;
			}
			return slow;				
		}
	}			
	return null;
    }

    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(2);
        L.next.next = new ListNode(3);
        L.next.next.next = new ListNode(4);
        L.next.next.next.next = L.next.next;
        LinkedListCycleII test = new LinkedListCycleII();
        ListNode result = test.detectCycle(L);
        System.out.println(result.val);
    }    
}