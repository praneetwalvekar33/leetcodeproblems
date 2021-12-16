package arrays;
//	https://leetcode.com/problems/3sum/
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ThreeSumss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> ans = threeSums(nums);
		
		for(int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
	}
	
	public static List<List<Integer>> threeSums(int[] nums){
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			if(i > 0 && nums[i] == nums[i-1]) {
				continue;
			}
			
			int num1 = nums[i];
			int start = i+1;
			int end = nums.length-1;
			
			while(start < end) {
				int sum = num1+nums[start]+nums[end];
				if(sum > 0) {
					end--;
				}
				else if(sum < 0) {
					start++;
				}
				else {
					ArrayList<Integer> subArray = new ArrayList<Integer>();
					subArray.add(num1);
					subArray.add(nums[start]);
					subArray.add(nums[end]);
					ans.add(subArray);
					
					while(start < end && nums[start] == nums[start+1]) {
						start++;
					}
					
					while(start<end && nums[end] == nums[end-1]) {
						end--;
					}
					start++;
					end--;
				}
				
			}
			
			
		}
		return ans;
	}

}
