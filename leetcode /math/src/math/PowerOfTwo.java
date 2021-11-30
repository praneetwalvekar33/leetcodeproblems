package math;
//	https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 45;
		boolean ans = isPowerOfTwo(num);
		System.out.println(ans);
	}
	
	public static boolean isPowerOfTwo(int n) {
        boolean ans = true;
        if(n == 1) {
        	return ans;
        }
        int count = 0;
        while(n > 0) {
        	if((n & 1) == 1) {
        		count++;
        	}
        	n = n >> 1;
        }
        if(count != 1) {
        	ans = false;
        }
        return ans;
    }

}
