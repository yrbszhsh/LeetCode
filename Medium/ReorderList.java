/**
 * ReorderList
 */
public class ReorderList {

    public ReorderList () {
        
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
        {
            return;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while (ptr1.next != null && ptr1.next.next != null) {
            ptr1 = ptr1.next.next;
            ptr2 = ptr2.next;
        }
        ListNode preMiddle = ptr2;
        ListNode preCurrent = ptr2.next;
        while(preCurrent.next!=null){
            ListNode current=preCurrent.next;
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
        }
        ptr2 = preMiddle.next;
        ptr1 = head;
        System.out.println(ptr1.val);
        System.out.println(ptr1.next.val);
        System.out.println(ptr1.next.next.val);
        while (ptr1 != preMiddle) {
            preMiddle.next = ptr2.next;
            ptr2.next = ptr1.next;
            ptr1.next = ptr2;
            ptr1 = ptr2.next;
            ptr2 = preMiddle.next;
        }
        return;
    }

    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(2);
        L.next.next = new ListNode(3);
        //L.next.next.next = new ListNode(4);
        ReorderList test = new ReorderList();
        test.reorderList(L);
        System.out.println(L.val);
        System.out.println(L.next.val);
        System.out.println(L.next.next.val);
        //System.out.println(L.next.next.next.val);
    }
}