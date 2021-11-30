package math;
//	https://leetcode.com/problems/daily-temperatures/submissions/
public class DailyTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temperature = {73,74,75,71,69,72,76,73};
		int[] ans = dailyTemperatures(temperature);
		for(int i = 0; i < temperature.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}
	
	public static int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
		int ans[] = new int[len];
		
		for(int i = 0; i < len-1; i++) {
			int count = 0;
			for(int j = i + 1; j < len; j++) {
			
				count++;
				
				if(j == len - 1 && temperatures[i] >= temperatures[j]) {
					count = 0;
				}
				else if(j == len - 1 && temperatures[i] == temperatures[j])
				
				if(temperatures[i] < temperatures[j]) {
					break;
				}
				
				
			}
			ans[i] = count;
		}
		ans[len - 1] = 0;
		return ans;
    }
}
