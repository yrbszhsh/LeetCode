/**
 * AddTwoNumbersII
 */
import java.util.*;
public class AddTwoNumbersII {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public AddTwoNumbersII () {
        
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String str1 = "";
        String str2 = "";
        while(l1 != null){
            str1 += Character.forDigit(l1.val, 10);
            l1 = l1.next;
            System.out.println(str1);
        }
        while(l2 != null){
            str2 += Character.forDigit(l2.val, 10);
            l2 = l2.next;
            System.out.println(str2);
        }
        int p1 = str1.length();
        int p2 = str2.length();
        int carry = 0;
        String res = "";
        while (p1 > 0 || p2 > 0 || carry > 0 ) {
            int m = (p1 <= 0? 0 : Character.getNumericValue(str1.charAt(p1-1)));
            int n = (p2 <= 0? 0 : Character.getNumericValue(str2.charAt(p2-1)));
            int sum = (m + n + carry) % 10;
            carry = (m + n + carry) / 10;
            res += Character.forDigit(sum, 10);
            p1 = p1 - 1;
            p2 = p2 - 1;
            System.out.println(res);
        }
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int p = res.length();
        while (p != 0) {
            ptr.next = new ListNode(Character.getNumericValue(res.charAt(p-1)));
            ptr = ptr.next;
            p = p - 1;
        }
        return result.next;   
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        AddTwoNumbersII a = new AddTwoNumbersII();
        ListNode result = a.addTwoNumbers(l1, l2);
        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);
        System.out.println(result.next.next.next.val);
    }
}