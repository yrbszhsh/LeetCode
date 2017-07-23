/**
 * AddTwoNumbers
 */
public class AddTwoNumbers {

    public AddTwoNumbers() {

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        int sum = (l1 == null? 0 : l1.val) + (l2 == null? 0 : l2.val);
        int carry = sum/10;
        ListNode result = new ListNode(sum%10);  
        ListNode temp = result;
        while(!(l1.next == null && l2.next == null && carry == 0)) {
            sum = (l1.next == null? 0 : l1.next.val) + (l2.next == null? 0 : l2.next.val) + carry;
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            temp = temp.next;
            l1 = (l1.next == null? l1 : l1.next);
            l2 = (l2.next == null? l2 : l2.next);
        }
        return result;
    }
    public static void main(String[] args) {
        AddTwoNumbers a = new AddTwoNumbers();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(7);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(2);
        ListNode res = a.addTwoNumbers(l1, l2);
        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);
    }
}