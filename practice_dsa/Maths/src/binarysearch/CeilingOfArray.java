package binarysearch;
//	Find the ceiling of a given number from an array
//	Ceiling is the smallest element in the array greater than equal to target
public class CeilingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,5,9, 14,16,18};
		int target = 18;
		int ans = ceilingValue(nums, target);
		System.out.println(nums[ans]);
	}
	
	public static int ceilingValue(int[] nums, int target) {
		int ans = 0;
		int start = 0; 
		int end = nums.length-1;
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(nums[mid] == target || (nums[mid-1]<target&&nums[mid]>target)) {
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
