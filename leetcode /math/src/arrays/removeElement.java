package arrays;
// https://leetcode.com/problems/remove-element/
public class removeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		int k = removeElement(nums, val);
		for(int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] != val) {
        		nums[count] = nums[i];
        		count++;
        	}
        }
        return count;
    }
}
