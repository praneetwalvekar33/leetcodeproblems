package binarysearch;
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class SearchInRotatedSortedDulicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,2,0  };
		int target = 1;
		boolean contains = search(nums, target);
		System.out.println(contains);
	}
	
	public static boolean search(int[] nums, int target) {
        boolean contains = false;
        
        int peakElementIndex = searchIndexOfPeakElement(nums);
        System.out.println(peakElementIndex);
        if(peakElementIndex == -1) {
        	return false;
        }
        if(nums[peakElementIndex] == target) {
        	return true;
        }
        if(nums[0] <= target) {
        	contains = binarySearch(nums, target, 0, peakElementIndex-1);
        }
        else {
        	contains = binarySearch(nums, target, peakElementIndex+1, nums.length-1);
        }
        return contains;
    }
	
	public static int searchIndexOfPeakElement(int[] nums) {
		if(nums.length == 1) {
			return nums.length-1;
		}
		
		int start = 0;
		int end = nums.length-1;
		if(nums[start] < nums[end]) {
			return end;
		}
		int index = -1;
		while(start < end) {
			int mid = start + (end-start) / 2;
			if(mid > start && nums[mid-1] > nums[mid]) {
				return mid-1;
			}
			
			if(mid < end && nums[mid] > nums[mid+1]) {
				return mid;
			}
			
			if(nums[start] == nums[mid] && nums[mid] == nums[end]) {
				if(nums[start]> nums[start+1]) {
					return start;
				}
				start++;
				if(nums[end] < nums[end-1]) {
					return end-1;
				}
				end--;
			}
			else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[end] < nums[mid])) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return index;
	}
	
	public static boolean binarySearch(int[] nums, int target, int start, int end) {
		if(nums.length == 1 && nums[0] == target) {
			return true;
		}
		
		boolean contains = false;
		while(start <= end) {
			int mid = start + (end-start) / 2;
			
			if(nums[mid] < target) {
				start = mid+1;
			}
			else if(nums[mid] > target) {
				end = mid-1;
			}
			else {
				contains = true;
				break;
			}
		}
		return contains;
	}
}
