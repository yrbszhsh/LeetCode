/**
 * CopyListwithRandomPointer
 */
public class CopyListwithRandomPointer {

    public CopyListwithRandomPointer () {
        
    }

/*  Definition for singly-linked list with a random pointer. */
    public static class RandomListNode {
        public int label;
        public RandomListNode next, random;
        public RandomListNode(int x) { this.label = x; }
    }
    
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode ptr = head;
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        while (ptr != null) {
            map.put(ptr, new RandomListNode(ptr.label));
            ptr = ptr.next;
        }
        ptr = head;
        while (ptr != null) {
            map.get(ptr).next = map.get(ptr.next);
            map.get(ptr).random = map.get(ptr.random);
            ptr = ptr.next;
        }
        return map.get(head);
    }
}