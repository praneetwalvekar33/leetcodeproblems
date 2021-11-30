package arrays;
//	https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
public class RemoveDuplicateSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int k = removeDuplicates(nums);
		System.out.println(k);

	}
	
	public static int removeDuplicates(int[] nums) {
        int ans = nums.length;
        if(ans == 0) {
        	return ans;
        }
        int count = 0;
		int num = nums[0];
        for(int i = 0; i < nums.length; i++) {
        	if(num != nums[i]) {
        		nums[++count] = nums[i];
        		num = nums[i];
        	}
        }
        return ++count;
	}
}
