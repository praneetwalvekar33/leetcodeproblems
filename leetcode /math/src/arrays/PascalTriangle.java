package arrays;
//	https://leetcode.com/problems/pascals-triangle/

import java.util.List;
import java.util.ArrayList;
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		List<List<Integer>> ans = generate(num);
		for(int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i));
		}
	}
	
	public static List<List<Integer>> generate(int numRows) {
		
        List<List<Integer>> ans = new ArrayList<>(numRows);
        if(numRows == 1) {
        	List<Integer> num = new ArrayList<>();
        	num.add(1);
        	ans.add(num);
        }
        else if(numRows == 2) {
        	List<Integer> num1 = new ArrayList<>();
        	num1.add(1);
        	ans.add(num1);
        	List<Integer> num2 = new ArrayList<>();
        	num2.add(1);
        	num2.add(1);
        	ans.add(num2);
        }
        else {
        	List<Integer> num1 = new ArrayList<>(1);
        	num1.add(1);
        	ans.add(num1);
        	List<Integer> num2 = new ArrayList<>(2);
        	num2.add(1);
        	num2.add(1);
        	ans.add(num2);
        	int i = 2;
        	while(i < numRows) {
        		List<Integer> newNums = newRow(ans.get(i-1));
        		ans.add(newNums);
        		i++;
        	}
        }
        return ans;
    }
	
	public static List<Integer> newRow(List<Integer> prevRow){
		int sizeOfRow = prevRow.size()+1;
		List<Integer> newRow = new ArrayList<Integer>(sizeOfRow);
		int i = 0;
		newRow.add(1);
		while(i < sizeOfRow-2) {
			int num = prevRow.get(i) + prevRow.get(i+1);
			newRow.add(num);
			i++;
		}
		newRow.add(1);
		return newRow;
	}

}
