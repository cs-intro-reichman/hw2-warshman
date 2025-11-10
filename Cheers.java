//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0].toUpperCase();
            String aOrAn = "a";
            String condition = "AEFHILMNORSX";

            for (int i = 0; i < word.length(); i++) {
                int matches = 0;
                
                for (int j = 0; j < condition.length(); j++) {
                        if (word.charAt(i) == condition.charAt(j)) {
                                matches++;
                        }
                }

                if (matches == 1) {
                        aOrAn = "an";
                } else {
                        aOrAn = "a";
                }
                
                System.out.println("Give me " + aOrAn + " " + word.charAt(i) + ": " + word.charAt(i) + "!");
            }
            
            System.out.println("What does that spell?");

            for (int i = 0; i < 5; i++) {
                System.out.println(word + "!!!");
            }
        }
}
