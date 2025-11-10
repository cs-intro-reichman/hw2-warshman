public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int addedtime = Integer.parseInt(args[1]);
        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));

        int totalminutes = hours * 60 + minutes + addedtime;
        int totalhours = totalminutes / 60;

        int minutesfinal = totalminutes - totalhours * 60;
        int hoursfinal = totalhours % 24;

        String minutesFormatted = "";
        String hoursFormatted = "";
        //reformat the time
        if (minutesfinal < 10) {
            minutesFormatted = "0" + minutesfinal;
        } else {
            minutesFormatted = "" + minutesfinal;
        }

        if (hoursfinal < 10) {
            hoursFormatted = "0" + hoursfinal;
        } else {
            hoursFormatted = "" + hoursfinal;
        }

        System.out.println(hoursFormatted + ":" + minutesFormatted);
    }
}

