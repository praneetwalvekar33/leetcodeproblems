package binarysearch;
//	https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class PositionInInfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,4,8,11,15,43,53,66,84,88,99};
		int target = 15;
		int index = searchInfiniteArray(nums, target);
		System.out.println(index);
	}
	
	public static int searchInfiniteArray(int[] nums, int target) {
		int start = 0;
		int end = 1;
		while(target > nums[end]) {
			int temp = start;
			start = end+1;
			end = end+(end-temp+1)*2;
		}
		int ans = binarySearch(start, end, target, nums);
		return ans;
	}
	
	public static int binarySearch(int start, int end, int target, int[] nums) {
		int ans = -1;
		while(start <= end) {
			int mid = start+(end-start)/2;
			if(nums[mid] > target) {
				end = mid-1;
			}
			else if(nums[mid] < target) {
				start = mid+1;
			}
			else {
				ans = mid;
				break;
			}
		}
		return ans;
	}

}
