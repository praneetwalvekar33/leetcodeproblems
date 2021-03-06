package math;
//	https://leetcode.com/problems/unique-paths/submissions/
public class UniquePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		int ans =uniquePaths(m, n);
		System.out.println(ans);
	}
	
	public static int uniquePaths(int m, int n) {
        if(m == 1 && n == 1) {
        	return 1;
        }
        
        int[][] nums = new int[m][n];
        for(int i = 1; i < m; i++) {
        	nums[i][0] = 1;
        }
        
        for(int j = 1; j < n; j++) {
        	nums[0][j] = 1;
        }
        
        for(int i = 1; i < m; i++) {
        	for(int j = 1; j < n; j++) {
        		nums[i][j] = nums[i-1][j] + nums[i][j-1];
        	}
        }
        return nums[m-1][n-1];
    }
}
