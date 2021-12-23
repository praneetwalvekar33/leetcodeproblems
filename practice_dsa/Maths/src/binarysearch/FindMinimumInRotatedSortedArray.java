package binarysearch;
//	https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2};
		int ans = findMin(nums);
		System.out.println(ans);
	}
	
	public static int findMin(int[] nums) {
        int minValue = -1;
        int start = 0;
        int end = nums.length-1;
        while(start < end) {
        	int mid = start + (end-start) / 2;
        	if(nums[mid-1] > nums[mid]) {
        		end = mid-1;
        	}
        	else {
        		start = mid;
        	}
        }
        minValue = nums[end+1];
        return minValue;
    }

}
