/**
 * IntersectionofTwoLinkedLists
 */
public class IntersectionofTwoLinkedLists {

    public IntersectionofTwoLinkedLists () {
        
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int sizeA = 0;
        int sizeB = 0;
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        while(ptr1 != null) {
            sizeA += 1;
            ptr1 = ptr1.next;
        }
        while(ptr2 != null) {
            sizeB += 1;
            ptr2 = ptr2.next;
        }
        int diff = sizeA - sizeB;
        while (diff > 0) {
            headA = headA.next;
            diff = diff - 1;
        } 
        while (diff < 0) {
            headB = headB.next;
            diff = diff + 1;
        }     
        while(headA != null){
            if(headA == headB){
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        A.next = new ListNode(2);
        A.next.next = new ListNode(3);
        ListNode B = new ListNode(1);
        //ListNode B = A.next.next;
        IntersectionofTwoLinkedLists test = new IntersectionofTwoLinkedLists();
        ListNode result = test.getIntersectionNode(A, B);
    }
}