package arrays;
//	https://leetcode.com/problems/richest-customer-wealth/submissions/
public class RichestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts = {{1,5},{3,7},{3,5}};
		int ans = maximumWealth(accounts);
		System.out.println(ans);
	}
	public static int maximumWealth(int[][] accounts) {
		int maxValue = accounts[0][0];
		
		for(int i = 0; i < accounts.length; i++) {
			int temp = 0;
			for(int j = 0; j < accounts[i].length; j++) {
				temp += accounts[i][j];
			}
			if(maxValue < temp) {
				maxValue = temp;
			}
		}
		return maxValue;
    }
}
