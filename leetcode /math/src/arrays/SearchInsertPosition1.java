package arrays;
//	https://leetcode.com/problems/search-insert-position/
//	Better Approach
public class SearchInsertPosition1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		int target = 2;
		int ans = searchInsert(nums, target);
		System.out.println(ans);
	}
	
	public static int searchInsert(int[] nums, int target){
		int ans = -1;
		int start = 0;
		int end = nums.length -1;
		while(start <= end) {
			int mid = start + ((end-start) /2);
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] > target) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		ans = start;
		return ans;
	}
}
