package arrays;
//	https://leetcode.com/problems/merge-sorted-array/submissions/
public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1};
		int[] num2 = {};
		int m = 1;
		int n = 0;
		merge(num1, m, num2, n);
		for(int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
	}
		
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0;
		int j = 0;
	
		while(i < nums1.length) {
			if(j < n && nums2[j] < nums1[i]) {
				int temp = nums1[i];
				nums1[i] = nums2[j];
				j++;
				for(int k = i+1; k < nums1.length; k++) {
					int temp1 = nums1[k];
					nums1[k] = temp;
					temp = temp1;
				}
			}
			else {
				i++;
			}
		}
		if(j != n) {
			int l = nums1.length - (n - j);
			while(j < n && l < nums1.length) {
				nums1[l] = nums2[j];
				l++;
				j++;
			}
		}
    }

}
