/**
 * PartitionList
 */
public class PartitionList {

    public PartitionList () {
        
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode greater = new ListNode(0);
        ListNode ptr1 = less;
        ListNode ptr2 = greater;
        while (head != null) {
            if(head.val < x) {
                ptr1.next = new ListNode(head.val);
                ptr1 = ptr1.next;
                head = head.next;
            } else {
                ptr2.next = new ListNode(head.val);
                ptr2 = ptr2.next;
                head = head.next;
            }
        }
        ptr1.next = greater.next;
        return less.next;
    }
    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(2);
        L.next.next = new ListNode(3);
        L.next.next.next = new ListNode(1);
        PartitionList test = new PartitionList();
        L = test.partition(L,2);
        System.out.println(L.val);
        System.out.println(L.next.val);
        System.out.println(L.next.next.val);
        System.out.println(L.next.next.next.val);
    }
}