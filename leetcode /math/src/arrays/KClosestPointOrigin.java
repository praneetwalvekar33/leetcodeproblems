package arrays;
//	https://leetcode.com/problems/k-closest-points-to-origin/
import java.util.ArrayList;
import java.util.Collections;

public class KClosestPointOrigin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = {{1,3},{-2, 2}};
		int k = 2;
		int[][] ans = kClosest(points, k);
		for(int i = 0; i < ans.length; i++) {
			for(int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
		}
	}
	
	public static int[][] kClosest(int[][] points, int k) {
		int row = k;
		int col = 2;
		
		int[][] ans = new int[row][col];
		ArrayList<Double> dis = new ArrayList<>();
		 
		for(int i = 0; i < points.length; i++) {
			dis.add(distanceOrigin(points[i][0],points[i][1]));
		}
		
		double[] array = new double[dis.size()];
		for(int i =0; i < dis.size(); i++) {
			array[i] = dis.get(i);
			System.out.println(array[i]);
		}
		
		ArrayList<Integer> pos = new ArrayList<>();
		for(int i = 0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i]> array[j]) {
					double temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					pos.set(i, j);
					pos.set(j, i);
				}
				//else {
				//	pos.set(i, i);
				//	pos.set(j, j);
				//}
			}
		}
		
		//int i = 0;
		//while(k > 0) {
		//	ans[i][0] = points[pos.get(i)][0];
		//	ans[i][1] = points[pos.get(i)][1];
		//	i++;
		//	k--;
		//}
		return ans;
    }
	public static double distanceOrigin(int x, int y) {
		int ans = 0;
		if(x > y) {
			ans =  (int)Math.floor(Math.sqrt((x * x) - (y * y)));
		}
		else {
			ans =  (int)Math.floor(Math.sqrt((y * y) - (x * x)));
		}
		return ans;
	}

}
