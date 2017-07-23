/**
 * DeleteNodeinaLinkedList
 */
public class DeleteNodeinaLinkedList {

    public DeleteNodeinaLinkedList () {
        
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        DeleteNodeinaLinkedList d = new DeleteNodeinaLinkedList();
        ListNode L = new ListNode(1);
        L.next = new ListNode(2);
        L.next.next = new ListNode(3);
        L.next.next.next = new ListNode(4);
        d.deleteNode(L.next);
        System.out.println(L.val);
        System.out.println(L.next.val);
        System.out.println(L.next.next.val);
    }
}