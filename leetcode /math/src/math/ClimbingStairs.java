package math;
//	https://leetcode.com/problems/climbing-stairs/

public class ClimbingStairs {
	public static void main(String[] args) {
		int num = 3;
		int ans = climbStairs(num);
		System.out.println(ans);
	}
	public static int climbStairs(int n) {
		int[] ans = new int[n+1];
		ans[0] = 1;
		ans[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			ans[i] = ans[i-1] + ans[i -2];
		}
        return ans[n];
    }
}
