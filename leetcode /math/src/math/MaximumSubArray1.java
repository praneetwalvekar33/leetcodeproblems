package math;
//	https://leetcode.com/problems/maximum-subarray/
//	Kadane Algorithm
public class MaximumSubArray1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int ans = maxSubArray(arr);
		System.out.println(ans);
	}
	
	public static int maxSubArray(int[] nums) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			
			max = Math.max(max, sum);
			
			if(sum < 0) {
				sum = 0;
			}
		}
		return max;
	}
}
