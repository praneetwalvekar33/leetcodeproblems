package binarysearch;
//	Find the floor of a number from an given array
//	Floor of a number is the greatest number smaller than equal to target value
public class FloorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,5,9,14,16,18};
		int target = 8;
		int ans = floorValue(nums, target);
		System.out.println(nums[ans]);
	}
	
	public static int floorValue(int[] nums, int target) {
		int ans = 0;
		int start = 0; 
		int end = nums.length-1;
		while(start <= end) {
			int mid = start +(end-start)/2;
			if(nums[mid] == target ||(nums[mid]<target && nums[mid+1]>target)) {
				return mid;
			}
			else if(nums[mid] > target) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return ans;
	}

}
