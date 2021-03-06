package math;
//	https://leetcode.com/problems/integer-to-roman/
public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 58;
		String ans = intToRoman(num);
		System.out.println(ans);
	}
	
	public static String intToRoman(int num) {
		int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		String ans = "";
		for(int i = 0; i < val.length; i++) {
			if(val[i] <= num) {
				ans += roman[i];
				num -= val[i];
				i--;
			}
		}
		return ans;
	}

}
