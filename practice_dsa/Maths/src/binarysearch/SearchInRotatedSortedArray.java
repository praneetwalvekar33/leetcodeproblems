package binarysearch;
//	https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2};
		int target = 2;
		int index = search(nums, target);
		System.out.println(index);
	}
	
	public static int search(int[] nums, int target) {
		if(nums.length == 1 && nums[0] == target){
            return 0;
        }
		
		int index = -1;
        int peakElementIndex = peakElementSearch(nums);
        if(nums[0] <= target) {
        	index = binarySearch(0, peakElementIndex, target, nums);
        }
        else {
        	index = binarySearch(peakElementIndex+1, nums.length-1, target, nums);
        }
        
        return index;
    }
	
	public static int peakElementSearch(int[] nums) {
		int index = -1;
		int start = 0;
		int end = nums.length-1;
		if(nums[start] < nums[end]){
            return end;
        }
		while(start < end) {
			int mid = start + (end-start) / 2;
			if(nums[start] < nums[mid]) {
				start = mid;
			}
			else if(nums[start] > nums[mid]) {
				end = mid;
			}
			else {
				index = start;
				break;
			}
		}
		return index;
	}
	
	public static int binarySearch(int start, int end, int target, int[] nums) {
		int index = -1;
		while(start <= end) {
			int mid = start + (end-start) / 2;
			if(nums[mid] > target) {
				end = mid-1;
			}
			else if(nums[mid] < target) {
				start = mid+1;
			}
			else{
				index = mid;
				break;
			}
		}
		return index;
	}

}
