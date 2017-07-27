/**
 * RemoveDuplicatesfromSortedListII
 */
public class RemoveDuplicatesfromSortedListII {

    public RemoveDuplicatesfromSortedListII () {
        
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    
    public ListNode deleteDuplicates(ListNode head) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode ptr1 = sentinel;
        ListNode ptr2 = head;
        int count = 0;
        while (ptr2 != null) {
            while(ptr2.next != null && ptr2.val == ptr2.next.val) {
                ptr2 = ptr2.next;
                count = count + 1;
            }
            if(count == 0){
                ptr1.next = ptr2;
                ptr1 = ptr1.next;              
            }
            count = 0;
            ptr2 = ptr2.next;
        }
        ptr1.next = ptr2;
        return sentinel.next;
    }
    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(1);
        L.next.next = new ListNode(2);
        L.next.next.next = new ListNode(3);
        RemoveDuplicatesfromSortedListII test = new RemoveDuplicatesfromSortedListII();
        L = test.deleteDuplicates(L);
        System.out.println(L.val);
        System.out.println(L.next.val);
        //System.out.println(L.next.next.val);
        //System.out.println(L.next.next.next.val);        
    }
}