/**
 * RotateList
 */
public class RotateList {

    public RotateList () {
        
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int size = 0;
        ListNode ptr = head;
        while (ptr != null) {
            size++;
            ptr = ptr.next;
        }
        k = k % size;
        if(k == 0) {
            return head;
        }
        System.out.println(size);
        ListNode ptr1 = new ListNode(0);
        ptr1.next = head;
        while (size != k) {
            ptr1 = ptr1.next;
            size = size - 1;
        }
        ptr = ptr1;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = head;
        head = ptr1.next;
        ptr1.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(2);
        L.next.next = new ListNode(3);
        //L.next.next.next = new ListNode(1);
        RotateList test = new RotateList();
        L = test.rotateRight(L,3);
        System.out.println(L.val);
        System.out.println(L.next.val);
        System.out.println(L.next.next.val);
        //System.out.println(L.next.next.next.val);
    }
}