package math;
//	https://leetcode.com/problems/roman-to-integer/
public class RomanToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "III";
		int ans = romanToInt(str);
		System.out.println(ans);

	}
	public static int romanToInt(String s) {
        int ans = 0;
        char[] str = s.toCharArray();
        for(int i = 0; i < str.length; i++) {
        	if(i+1 < str.length && str[i] == 'I' && str[i+1] == 'V') {
        		ans += 4;
        		i++;
        	}
        	else if(i+1 < str.length && str[i] == 'I' && str[i+1] == 'X') {
        		ans += 9;
        		i++;
        	}
        	else if(str[i] == 'I') {
        		ans += 1;
        	}
        	else if(str[i] == 'V') {
        		ans += 5;
        	}
        	else if(i+1 < str.length && str[i] == 'X' && str[i+1] == 'L') {
        		ans += 40;
        		i++;
        	}
        	else if(i+1 < str.length && str[i] == 'X' && str[i+1] == 'C') {
        		ans += 90;
        		i++;
        	}
        	else if(str[i] == 'X') {
        		ans += 10;
        	}
        	else if(str[i] == 'L') {
        		ans += 50;
        	}
        	else if(i+1 < str.length && str[i] == 'C' && str[i+1] == 'D') {
        		ans += 400;
        		i++;
        	}
        	else if(i+1 < str.length && str[i] == 'C' && str[i+1] == 'M') {
        		ans += 900;
        		i++;
        	}
        	else if(str[i] == 'C') {
        		ans += 100;
        	}
        	else if(str[i] == 'D') {
        		ans += 500;
        	}
        	else if(str[i] == 'M') {
        		ans += 1000;
        	}
        }
        
        return ans;
    }

}
