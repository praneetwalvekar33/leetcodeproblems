package arrays;
//	https://leetcode.com/problems/product-of-array-except-self/
public class ProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		int[] ans = productExpectSelf(nums);
		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
	public static int[] productExpectSelf(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		ans[0] = 1;
		for(int i = 1; i < n; i++) {
			ans[i] = ans[i-1] * nums[i-1];
		}
		
		int last = nums[n-1];
		
		for(int i = n-2; i >= 0; i--) {
			ans[i] *= last;
			last *= nums[i];
		}
		
		return ans;
	}

}
