// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

public class Remove_nth_node {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head==null) return head;
	        ListNode dummy=new ListNode(-1);
	        dummy.next=head;
	        ListNode slow=dummy;
	        ListNode fast=dummy;
	        int count=0;
	            
	        while(count<=n && fast!=null ){
	           
	            fast=fast.next;
	            
	            count++;
	        }
	        while(fast!=null){
	            slow=slow.next;
	            fast=fast.next;
	        }
	             
	        ListNode temp=slow.next;
	        slow.next=slow.next.next;
	        temp.next=null;
	        return dummy.next;
	 }
	 
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
}