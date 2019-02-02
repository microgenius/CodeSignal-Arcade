package intro.smoothsailing;

public class IsLucky {
  boolean isLucky(int n) {
    String ticketNumber = Integer.toString(n);

    int sumFirstHalf = 0, sumSecondHalf = 0;

    for (int i = 0; i< ticketNumber.length() / 2; i++)
      sumFirstHalf += ticketNumber.charAt(i);

    for (int i = ticketNumber.length() / 2; i< ticketNumber.length(); i++)
      sumSecondHalf += ticketNumber.charAt(i);

    return sumFirstHalf == sumSecondHalf;
  }
}
