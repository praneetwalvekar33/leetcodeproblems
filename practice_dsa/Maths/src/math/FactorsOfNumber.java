package math; 
import java.util.ArrayList;
//	Factors of a number(Brute Force)
public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 30;
		factor2(num);
	}
	private static void factor(int num) {
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	//	o(sqrt(num))
	//	Better approach
	private static void factor2(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i < Math.sqrt(num); i++) {
			if(num % i == 0) {
				if(num / i == i) {
					System.out.print(i + " ");
				}
				else {
					System.out.print(i + " ");
					list.add(num / i);
				}
			}
		}
		
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}
	

}
