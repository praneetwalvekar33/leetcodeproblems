package math;
//	https://leetcode.com/problems/fizz-buzz/

import java.util.List;
import java.util.ArrayList;
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		List<String> ans = fizzBuzz(n);
		for(int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
	}
	
	public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        for(int i = 1; i <= n; i++) {
        	if(i % 3 == 0 && i % 5 == 0) {
        		ans.add("FizzBuzz");
        	}
        	else if(i % 3 == 0) {
        		ans.add("Fizz");
        	}
        	else if(i % 5 == 0) {
        		ans.add("Buzz");
        	}
        	else {
        		ans.add("" + i);
        	}
        }
        return ans;
    }
}
