package binarysearch;
//	https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstLastPositionOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5, 7, 7, 8, 8, 10};
		int target = 8;
		int[] ans = searchRange(nums, target);
		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
	public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
	
	public static int search(int[] nums, int target, boolean right) {
		int ans = -1;
		int start = 0; 
		int end = nums.length-1;
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(nums[mid] > target) {
				end = mid-1;
			}
			else if(nums[mid] < target) {
				start = mid+1;
			}
			else {
				ans = mid;
				if(right) {
					end = mid-1;
				}
				else {
					start = mid+1;
				}
			}
		}
		return ans;
	}
}
