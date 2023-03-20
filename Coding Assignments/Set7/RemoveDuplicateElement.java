package Set7;


import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement {
    class ListNode{
        ListNode next;
        int val;
        ListNode(){}
        ListNode(ListNode next, int val) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeDup(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null) {
            if(!set.add(cur.val)) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
