package arrays;
//	https://leetcode.com/problems/merge-sorted-array/
// 	Better approach
public class MergeSortedArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1,2,3,0,0,0};
		int[] num2 = {2,5,6};
		int m = 3;
		int n = 3;
		merge(num1, m, num2, n);
		for(int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
	}
		public static void merge(int[] nums1, int m, int[] nums2, int n) {
			int i = nums1.length - 1;
			
			while(m > 0 && n > 0) {
				if(nums1[m-1] >= nums2[n-1]) {
					nums1[i] = nums1[m-1];
					m--;
				}
				else {
					nums1[i] = nums2[n-1];
					n--;
				}
				i--;
			}
			
			while(n > 0) {
				nums1[i] = nums2[n -1];
				n--;
				i--;
			}
		}
	

}
