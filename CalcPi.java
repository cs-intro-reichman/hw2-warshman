// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numberOfTerms = Integer.parseInt(args[0]);
		double sum = 1.0;
		double denominator = 3.0;

		for (int i = 1; i < numberOfTerms; i++) {
			if (i % 2 == 0) {
				sum += 1.0 / denominator;
			} else {
				sum -= 1.0 / denominator;
			}
			denominator += 2.0;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + sum * 4);
	}
}
