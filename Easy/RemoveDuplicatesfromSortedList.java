/**
 * RemoveDuplicatesfromSortedList
 */
public class RemoveDuplicatesfromSortedList{

    public RemoveDuplicatesfromSortedList () {
        
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode result = new ListNode(head.val);
        ListNode p = result;
        while(head != null) {
            while (head.next != null && head.val == head.next.val) {
                head.next = head.next.next;
            }
            p.next = new ListNode(head.val);
            p = p.next;
            head = head.next;
        }
        return result.next;
    }
    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(1);
        L.next.next = new ListNode(2);
        L.next.next.next = new ListNode(3);
        L.next.next.next.next = new ListNode(3);
        RemoveDuplicatesfromSortedList r = new RemoveDuplicatesfromSortedList();
        ListNode result = r.deleteDuplicates(L);
        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);
    }
}