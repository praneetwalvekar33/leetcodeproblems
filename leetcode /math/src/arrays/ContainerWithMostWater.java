package arrays;
//	https://leetcode.com/problems/container-with-most-water/
//	burte force approach
public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,2,5,25,24,5};
		int ans = maxArea(nums);
		System.out.println(ans);
	}
	
	public static int maxArea(int[] height) {
		int area =Integer.MIN_VALUE;
		int start = 0;
		int end = height.length-1;
		
		while(start < end) {
			int length = Math.min(height[start], height[end]);
			int breadth = end-start;
			if(area < length*breadth) {
				area = length*breadth;
			}
			
			if(height[start]<height[end]) {
				start++;
			}
			else {
				end--;
			}
		}
		
		return area;
	}

}
