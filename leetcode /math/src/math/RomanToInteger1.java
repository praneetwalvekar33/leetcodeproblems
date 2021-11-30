package math;
//	https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "III";
		int ans = romanToInt(str);
		System.out.println(ans);
	}
	public static int romanToInt(String s) {
		char[] str = s.toCharArray();
		int ans = 0;
		for(int i = 0; i < str.length - 1; i++) {
			if(getCharValue(str[i]) < getCharValue(str[i+1])) {
				ans -= getCharValue(str[i]);
			}
			else {
				ans += getCharValue(str[i]);
			}
		}
		ans += getCharValue(str[str.length - 1]);
		return ans;
	}
	
	public static int getCharValue(char val) {
		int res = 0;
		switch (val) {
		case 'I': res = 1;
			break;
		case 'V' : res = 5;
			break;
		case 'X' : res = 10;
			break;
		case 'L' : res = 50;
			break;
		case 'C' : res = 100;
			break;
		case 'D' : res = 500;
			break;
		case 'M' : res = 1000;
			break;
		}
		return res;
	}
}
