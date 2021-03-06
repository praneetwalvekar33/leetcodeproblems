package arrays;
//	https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		int target = 2;
		int ans = searchInsert(nums, target);
		System.out.println(ans);
	}
	
	public static int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
        int ans = binarySearch(start, end, nums, target);
        if(ans == -1) {
        	for(int i = 0; i <= end; i++) {
        		if(target < nums[i]) {
        			ans = i;
        			break;
        		}
        		
        	}
        }
        if(ans == -1) {
        	ans = end+1;
        }
        return ans;
    }
	
	public static int binarySearch(int start, int end, int[] nums, int target) {
		int ans = -1;
		if(start <= end) {
			int mid = start + (end-start / 2);
			if(nums[mid] == target) {
				ans = mid;
			}
			else if(nums[mid] > target) {
				return binarySearch(start, mid - 1, nums, target);
			}
			else {
				return binarySearch(mid+1, end, nums,target);
			}
		}
		return ans;
	}
}
