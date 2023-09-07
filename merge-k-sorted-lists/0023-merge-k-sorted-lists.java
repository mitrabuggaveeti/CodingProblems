/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode dummy = new ListNode(0);

        for(ListNode curr : lists) {
            while(curr!=null) {
                pq.add(curr.val);
                curr = curr.next;
            }
        }

        ListNode curr = dummy;

        while(!pq.isEmpty()) {
            curr.next = new ListNode(pq.poll());
            curr = curr.next;
        }

        return dummy.next;
    }
}