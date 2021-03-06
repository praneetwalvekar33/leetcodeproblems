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
		if(nums.length == 1){
            return nums[0];
        }
        int minValue = -1;
        int start = 0;
        int end = nums.length-1;
        if(nums[start] < nums[end]){
            return nums[start];
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
        		minValue = nums[end];
        		break;
        	}
        }
        return minValue;
    }

}
