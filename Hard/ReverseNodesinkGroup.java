/**
 * ReverseNodesinkGroup
 */
public class ReverseNodesinkGroup {

    public ReverseNodesinkGroup () {
        
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reversekGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode ptr = sentinel;
        int size = 0;
        while (ptr.next != null) {
            ptr = ptr.next;
            size++;
        }
        ptr = sentinel;
        int times = size / k;
        while (times != 0) {
            reverseList(ptr,k);
            int n = k;
            while(n != 0) {
                ptr = ptr.next;
                n--;
            }
            times--;
        }
        return sentinel.next;
    }
    public void reverseList(ListNode sentinel, int k) {
        ListNode preMiddle = sentinel;
        ListNode preCurrent = sentinel.next;
        while(preCurrent.next!=null && k != 1){
            ListNode current=preCurrent.next;
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
            k--;
        }
    }
    
    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(2);
        L.next.next = new ListNode(3);
        L.next.next.next = new ListNode(4);
        L.next.next.next.next = new ListNode(5);
        ReverseNodesinkGroup test = new ReverseNodesinkGroup();
        ListNode result = test.reversekGroup(L,2);
        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);
        System.out.println(result.next.next.next.val);
        System.out.println(result.next.next.next.next.val);        
    }
}