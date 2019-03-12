package intro.landoflogic;

public class ValidTime {
  boolean validTime(String time) {
    final int HOUR_IND = 0;
    final int MINUTE_IND = 1;

    final String[] timeParts = time.split(":");

    return Integer.valueOf(timeParts[HOUR_IND]) < 24 && Integer.valueOf(timeParts[MINUTE_IND]) < 60;
  }
}
