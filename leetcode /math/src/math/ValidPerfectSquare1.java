package math;
//	https://leetcode.com/problems/valid-perfect-square/submissions/
//	Binary Search approach
public class ValidPerfectSquare1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		boolean ans = isPerfectSquare(n);
		System.out.println(ans);
	}
	
	public static boolean isPerfectSquare(int num) {
		if(num == 1) {
			return true;
		}
		int start = 1;
		int end = num;
		boolean ans = false;
		while(start <= end) {
			long mid = (start + (end-start) / 2);
			if(mid*mid == num) {
				ans = true;
				break;
			}
			else if(mid*mid > num) {
				end = (int) mid - 1;
			}
			else {
				start = (int) mid + 1;
			}
		}
		return ans;
        
    }

}
