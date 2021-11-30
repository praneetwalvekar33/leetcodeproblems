package math;
//	https://leetcode.com/problems/find-greatest-common-divisor-of-array/
public class GcdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,3};
		int ans = findGCD(nums);
		System.out.println(ans);

	}
	
	public static int findGCD(int[] nums) {
		int min = minNumber(nums);
		int max = maxNumber(nums);
		int ans = gcdNumber(max, min);
        return ans;
    }
	
	private static int minNumber(int[] nums) {
		int min = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(min > nums[i]) {
				min = nums[i];
			}
		}
		return min;
	}
	
	private static int maxNumber(int[] nums) {
		int max = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(max < nums[i]) {
				max = nums[i];
			}
		}
		return max;
	}
	
	private static int gcdNumber(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		}
		else {
			return gcdNumber(num2, num1 % num2);
		}
	}

}
