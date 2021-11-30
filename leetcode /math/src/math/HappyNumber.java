package math;
//	https://leetcode.com/problems/happy-number/submissions/
public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		boolean ans = isHappy(num);
		System.out.println(ans);
	}
	
	public static boolean isHappy(int n) {
		int len = (int) (Math.log(n) / Math.log(10)) + 1;
		int val = 0;
		if(len == 1 && n * n == 1) {
			return true;
		}
		else if(len == 1 && n * n <= 36) {
			return false;
		}
		else {
			int temp = 0;
			while(n > 0) {
				temp = n % 10;
				val += temp * temp;
				n = n / 10;
			}
			
		}
		return isHappy(val);
    }

}
