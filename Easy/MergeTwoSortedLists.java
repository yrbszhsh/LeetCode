/**
 * MergeTwoSortedLists
 */
public class MergeTwoSortedLists {

    public MergeTwoSortedLists () {
        
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                ptr.next = l1;
                l1 = l1.next;
                ptr = ptr.next;
            }
            else {
                ptr.next = l2;
                l2 = l2.next;
                ptr = ptr.next;
            }
        }
        ptr.next = (l1 == null? l2: l1);
        return result.next; 
    }

    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        A.next = new ListNode(2);
        A.next.next = new ListNode(3);
        ListNode B = new ListNode(2);
        B.next = new ListNode(5);
        MergeTwoSortedLists test = new MergeTwoSortedLists();
        ListNode result = test.mergeTwoLists(A, B);
        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);
        System.out.println(result.next.next.next.val);
        System.out.println(result.next.next.next.next.val);
    }
}