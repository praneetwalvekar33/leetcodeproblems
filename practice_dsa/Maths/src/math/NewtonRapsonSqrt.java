package math;

public class NewtonRapsonSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 36;
		System.out.println(sqrt(num));
	}
	
	private static double sqrt(int num) {
		double x = num;
		double root = 0;
		while(true) {
			root = 0.5 * (x +(num / x));
			
			if(Math.abs(root - x) < 0.1) {
				break;
			}
			
			x = root;
		}
		return root;
	}

}
