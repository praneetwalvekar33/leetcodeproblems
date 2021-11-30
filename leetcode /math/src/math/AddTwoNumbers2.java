package math;
//	https://leetcode.com/problems/add-digits/
public class AddTwoNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 38;
		int ans = addDigits(num);
		System.out.println(ans);
	}
	
	public static int addDigits(int num) {
        if(num == 0) {
        	return 0;
        }
        
        int length = (int) Math.floor(Math.log(num) / Math.log(10)) + 1;
        
        if(length == 1) {
        	return num;
        }
        else {
        	int ans = 0;
        	while(num > 0) {
        		 ans += num % 10;
        		num = num / 10;
        	}
        	return addDigits(ans);
        }
    }

}
