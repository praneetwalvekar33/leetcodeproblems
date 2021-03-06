package math;
//	https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int ans = maxSubArray(arr);
		System.out.println(ans);
	}
	
	public static int maxSubArray(int[] nums) {
		int ans = nums[0];
		for(int i = 0; i < nums.length; i++) {
			int sum = 0;
			for(int j = i; j < nums.length; j++) {
				sum += nums[j];
				if(ans < sum) {
					ans = sum;
				}
			}
		}
		return ans;
    }

}
