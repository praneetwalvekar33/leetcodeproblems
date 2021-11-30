package math;
//	https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
public class PostiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,-2,-3};
		int ans = minStartValue(nums);
		System.out.println(ans);
	}
	
	public static int minStartValue(int[] nums) {
        int startValue = 1;
        int ans = startValue;
        while(true) {
        	for(int i = 0; i < nums.length; i++) {
        		startValue += nums[i];
        		if(startValue < 1) {
        			break;
        		}
        	}
        	if(startValue >= 1) {
    			break;
        	}
        	ans++;
        	startValue = ans;
        }
        return ans;
	}
}
