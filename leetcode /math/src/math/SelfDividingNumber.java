package math;

import java.util.List;
import java.util.ArrayList;
public class SelfDividingNumber {
//	https://leetcode.com/problems/self-dividing-numbers/submissions/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 1;
		int right = 22;
		List<Integer> ans = selfDividingNumbers(left, right);
		for(int i = 0; i < ans.size(); i++){
			System.out.print(ans.get(i) +  " ");
		}
	}
		
	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i <= right; i++) {
        	int len = (int) Math.floor(Math.log(i) / Math.log(10)) + 1;
        	int j = len;
        	int num = i;
        	int count = 0;
        	while(j > 0) {
        		int temp = num % 10;
        		if(temp == 0) {
        			break;
        		}
        		else if(i % temp == 0) {
        			count++;
        		}
        		num = num / 10;
        		j--;
        	}
        	if(len == count) {
        		ans.add(i);
        	}
        }
        return ans;
    }
}
