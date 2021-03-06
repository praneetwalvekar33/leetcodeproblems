package math;
//	https://leetcode.com/problems/integer-to-roman/
import java.util.ArrayList;
public class IntegerToRoman2 {

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
			int div = num / val[i];
			for(int j = 0; j < div; j++) {
				ans += roman[i]; 
			}
			
			num -= div * val[i];
		}
		return ans;
	}
}
