package arrays;
//	https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
import java.util.List;
import java.util.ArrayList;

public class DisappearedNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> ans = findDisappearedNumbers(nums);
		for(int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
	}
	public  static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
        	int n = Math.abs(nums[i]) - 1;
        	if(nums[n] > 0) {
        		nums[n] *= -1;
        	}
        }
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] > 0) {
        		ans.add(i + 1);
        	}
        }
        return ans;
    }

}
