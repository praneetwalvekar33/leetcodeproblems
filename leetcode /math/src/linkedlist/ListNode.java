package linkedlist;
//	https://leetcode.com/problems/add-two-numbers/submissions/
public class ListNode {
	
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {9,9,9,9,9,9,9};
		int[] num2 = {9,9,9,9};
		ListNode l1 = convertArrayToList(num1);
		ListNode l2 = convertArrayToList(num2);
		ListNode ans = addTwoNumbers(l1, l2);
		while(ans != null) {
			System.out.print(ans.val + " ");
			ans = ans.next;
		}

	}
	public static ListNode convertArrayToList(int[] array)
	{
		ListNode prev = null;
		ListNode ans = null;
		for(int i = 0; i < array.length; i++) {
			ListNode temp = new ListNode(array[i]);
			temp.next = null;
			if(ans == null) {
				ans = temp;
				prev = temp;
			}
			else {
				prev.next = temp;
				prev = temp;
			}
		}
		return ans;
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
		int carry = 0;
		ListNode ans = null;
		ListNode prev = null;
		while(l1 != null && l2 != null) {
			int num = l1.val + l2.val;
			if(carry > 0) {
				num += carry;
			}
			ListNode temp = new ListNode(num % 10);
			carry = num / 10;
			temp.next = null;
			if(ans == null) {
				ans = temp;
				prev = temp;
			}
			else {
				prev.next = temp;
				prev = temp;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		
		while(l1 != null) {
			int num = l1.val;
			if(carry > 0) {
				num += carry;
			}
			ListNode temp = new ListNode(num % 10);
			carry = num / 10;
			temp.next = null;
			prev.next = temp;
			prev = temp;
			l1 = l1.next;
		}
		
		while(l2 != null) {
			int num = l2.val;
			if(carry > 0) {
				num += carry;
			}
			ListNode temp = new ListNode(num % 10);
			carry = num / 10;
			temp.next = null;
			prev.next = temp;
			prev = temp;
			l2 = l2.next;
		}
		
		if(l1 == null && l2 == null && carry > 0) {
			ListNode temp = new ListNode(carry);
			temp.next = null;
			prev.next = temp;
		}
		return ans;
    }
    
    

}
