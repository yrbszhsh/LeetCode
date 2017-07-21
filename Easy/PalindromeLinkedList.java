/**
 * PalindromeLinkedList
 */
public class PalindromeLinkedList {

    public PalindromeLinkedList () {
        
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode reverse(ListNode head) {
        ListNode p = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = p;
            p = head;
            head = temp;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null) {
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while(slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeLinkedList p = new PalindromeLinkedList();
        ListNode L = new ListNode(1);
        L.next = new ListNode(1);
        L.next.next = new ListNode(2);
        L.next.next.next = new ListNode(1);
        L.next.next.next.next = new ListNode(1);
        boolean b = p.isPalindrome(L);
        System.out.println(b);
    }
}