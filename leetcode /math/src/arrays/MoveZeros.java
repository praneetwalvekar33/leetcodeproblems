package arrays;
//	https://leetcode.com/problems/move-zeroes/
public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,3,12};
		moveZeroes(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void moveZeroes(int[] nums) {
		int numOfZeroes = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				nums[i-numOfZeroes] = nums[i];
			}
			else {
				numOfZeroes++;
			}
		}
		
		for(int i = nums.length-numOfZeroes; i < nums.length; i++) {
			nums[i] = 0;
		}
	}

}
