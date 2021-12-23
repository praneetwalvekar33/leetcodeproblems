package binarysearch;
//	https://leetcode.com/problems/find-in-mountain-array/
public class FindElementInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,4,2,1};
		int target = 3; 
		int index = findInMountainArray(target, arr);
		System.out.println(index);
	}
	
	public static int findInMountainArray(int target, int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length-1;
        int peakValue = peakOfMountain(start, end, mountainArr);
        int index = -1;
        if(mountainArr[peakValue] > target) {
        	index = binarySearch(start, peakValue, mountainArr, target);
        }
        else {
        	index = binarySearch(peakValue, end, mountainArr, target);
        }
        
        
        return index;
    }
	
	public static int peakOfMountain(int start, int end, int[] mountainArr) {
		while(start<end) {
			int mid = start + (end-start) / 2;
			if(mountainArr[mid] > mountainArr[mid+1]) {
				end = mid;
			}
			else {
				start = mid+1;
			}
		}
		return start;
	}
	
	public static int binarySearch(int start, int end, int[] mountainArr, int target) {
		int index = -1;
		if(mountainArr[start]<mountainArr[end]) {
			while(start <= end) {
				int mid = start + (end-start)/2;
				if(mountainArr[mid] > target) {
					end = mid-1;
				}
				else if(mountainArr[mid] < target) {
					start = mid+1;
				}
				else {
					index = mid;
					break;
				}
			}
		}
		else {
			while(start <= end) {
				int mid = start + (end-start)/2;
				if(mountainArr[mid] > target) {
					start = mid+1;
				}
				else if(mountainArr[mid] < target) {
					end = mid-1;
				}
				else {
					index = mid;
					break;
				}
			}
		}
		return index;
	}
}
