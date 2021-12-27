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
		int[] lis1 = {1,2,4};
		int[] lis2 = {1,3,4};
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
         while(list1 != null && list2 != null) {
        	 //if()
         }
         return head;
    }
		

}
