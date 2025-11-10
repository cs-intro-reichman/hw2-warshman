// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int number = Integer.parseInt(args[0]);
		String mode = args[1];

		if (mode.equals("v")) {
			for (int i = 1; i <= number; i++) {
				int sequenceNumber = i;
				boolean isNotOne = true;
				int steps = 1;
				String verboseRecord = "";

				while (isNotOne) {
					verboseRecord = verboseRecord + sequenceNumber + " ";
					if (sequenceNumber % 2 == 0) {
						sequenceNumber /= 2;
					} else {
						sequenceNumber = sequenceNumber * 3 + 1;
					}
					steps++;
					if (sequenceNumber == 1) {
						isNotOne = false;
					}
				}
				verboseRecord = verboseRecord + "1 (" + steps + ")";

				System.out.println(verboseRecord);
			
			}
			
			System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
		} else if (mode.equals("c")) {
			System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
		} else {
			System.out.println("Invalid input: type v or c instead");
		}

		
	}
}
