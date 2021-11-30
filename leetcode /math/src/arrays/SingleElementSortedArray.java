package arrays;
//	https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/
public class SingleElementSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,3,7,7,10,11,11};
		int ans = singleNonDuplicate(nums);
		System.out.println(ans);
	}
	
	public static int singleNonDuplicate(int[] nums) {
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++) {
        	ans = ans ^ nums[i];
        }
        return ans;
    }

}
