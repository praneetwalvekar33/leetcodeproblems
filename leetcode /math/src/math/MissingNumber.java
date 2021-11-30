package math;
//	https://leetcode.com/problems/missing-number/
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3,0,1};
		int ans = missingNumber(num);
		System.out.println(ans);

	}
	
	public static int missingNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
        	sum1 += nums[i];
        }
        
        for(int i = 0; i <= nums.length; i++) {
        	sum2 += i;
        }
        
        ans = sum2 - sum1;
        return ans;
    }

}
