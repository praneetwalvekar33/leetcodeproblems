package math;
//	https://leetcode.com/problems/valid-perfect-square/submissions/
//	(basic approach)
public class ValidPerfectSquare {

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
        boolean ans = false;
        for(int i = 1; i <= num/2; i++){
        	if(i*i == num) {
        		ans = true;
        		break;
        	}
        }
        return ans;
    }

}
