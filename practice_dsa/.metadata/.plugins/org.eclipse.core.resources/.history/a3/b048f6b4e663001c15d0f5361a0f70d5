package binarysearch;
//	https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexaaMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,5,7,9,13,11,4};
		int index=peakIndexInMountainArray(nums);
		System.out.println(index);
	}
	
	public static int peakIndexInMountainArray(int[] arr) {
        int start = 0; 
        int end = arr.length-1;
        int index = -1;
        while(start < end) {
        	int mid = start + (end-start) / 2;
        	if(arr[mid]>arr[mid+1]) {
        		end = mid;
        	}
        	else {
        		start = mid+1;
        	}
        }
        return start;
    }

}
