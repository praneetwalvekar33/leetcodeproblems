package binarysearch;
//	https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCountRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {15, 18, 2, 3, 6, 12};
		int rotation = findRotation(nums);
		System.out.println(rotation);
	}
	
	public static int findRotation(int[] nums) {
		int rotation = 0;
		int start = 0;
		int end = nums.length-1; 
		if(nums[start] < nums[end]) {
			return start;
		}
		while(start <= end) {
			int mid = start + (end-start) / 2;
			if(start<mid && nums[mid]> nums[mid+1]) {
				return mid+1;
			}
			
			if(end > mid && nums[mid] < nums[mid-1]) {
				return  mid;
			}
			
			if(nums[start] < nums[mid]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return rotation;
	}

}
