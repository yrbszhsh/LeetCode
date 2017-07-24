/**
 * SwapNodesinPairs
 */
public class SwapNodesinPairs {
    
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public SwapNodesinPairs () {
        
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        int size = 0;
        ListNode ptr = head;
        while (ptr != null) {
            size += 1;
            ptr = ptr.next;
        }           
        ListNode odd = head;
        ListNode even = head.next;
        ListNode newHead = even;
        if(size % 2 == 0) {
            while(even != null ) {
                ListNode temp = even.next;
                odd.next = (even.next == null? even.next : even.next.next);
                even.next = odd;
                odd = temp;
                even = (even.next == null? even.next : even.next.next);;
            }
            head = newHead;
            return head;
        }
        else {
            while(even != null && even.next != null) {
                ListNode temp = even.next;
                odd.next = (even.next.next == null? temp : even.next.next);
                even.next = odd;
                odd = temp;
                even = even.next.next;
            }
            head = newHead;
            return head;            
        }
    }
    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(2);
        //L.next.next = new ListNode(3);
        //L.next.next.next = new ListNode(1);
        //L.next.next.next.next = new ListNode(5);
        SwapNodesinPairs test = new SwapNodesinPairs();
        ListNode result = test.swapPairs(L);
        System.out.println(result.val);
        System.out.println(result.next.val);
        //System.out.println(result.next.next.val);
        //System.out.println(result.next.next.next.val);     
        //System.out.println(result.next.next.next.next.val);   
    }
}