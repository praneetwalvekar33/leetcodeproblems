package linkedlist;
//	https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeSortedList {
	
	

    int val;
    MergeSortedList next;
    MergeSortedList() {}
    MergeSortedList(int val) { this.val = val; }
    MergeSortedList(int val, MergeSortedList next) { this.val = val; this.next = next; }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lis1 = {};
		int[] lis2 = {1};
		MergeSortedList list1 = convertArrayToList(lis1); 
		MergeSortedList list2 = convertArrayToList(lis2);
		MergeSortedList ans = mergeTwoLists(list1, list2);
		while(ans != null) {
			System.out.print(ans.val + " ");
			ans = ans.next;
		}
		
	}
	
	public static MergeSortedList convertArrayToList(int[] list) {
		MergeSortedList head = null;
		MergeSortedList prev = null;
		int len = list.length-1;
		int n = 0;
		while(n <= len) {
			MergeSortedList temp = new MergeSortedList(list[n]);
			temp.next = null;
			if(head == null) {
				head = temp;
				prev = temp;
			}
			else {
				prev.next = temp;
				prev = temp;
			}
			n++;
		}
		return head;
	}
	
    public static MergeSortedList mergeTwoLists(MergeSortedList list1, MergeSortedList list2) {
         MergeSortedList head = null;
         MergeSortedList prev = null;
         while(list1 != null && list2 != null) {
        	 if(head == null && list1.val <= list2.val) {
        		 head = list1;
        		 prev = head;
        		 list1 = list1.next;
        	 }
        	 else if(head == null && list1.val > list2.val) {
        		 head = list2;
        		 prev = head;
        		 list2 = list2.next;
        	 }
        	 else if(list1.val < list2.val) {
        		 prev.next = list1;
        		 prev = list1;
        		 list1 = list1.next;
        	 }
        	 else {
        		 prev.next = list2;
        		 prev = list2;
        		 list2 = list2.next; 
        	 }
         }
         
         if(head == null && list1 != null) {
        	 head = list1;
        	 prev = list1;
         }
         else if(list1 != null) {
        	 prev.next = list1;
        	 prev = list1;
         }
         
         if(head == null && list2 != null) {
        	 head = list2;
        	 prev = list2;
         }
         else if(list2 != null) {
        	 prev.next = list2;
        	 prev = list2;
         }
         return head;
    }
		

}
