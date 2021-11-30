package math;
//	https://leetcode.com/problems/perfect-number/submissions/
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		boolean ans = checkPerfectNumber(num);
		System.out.println(ans);
	}
	public static boolean checkPerfectNumber(int num) {
		if(num == 1) {
			return false;
		}
        boolean ans = false;
        int sum = 1;
        for(int i = 2; i < Math.sqrt(num); i++) {
        	if(num % i == 0) {
        		sum += i;
        		sum += num / i;
        	}
        }
        if(sum == num) {
        	ans = true;
        }
        return ans;
    }
}