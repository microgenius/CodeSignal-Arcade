package intro.thejourneybegins;

import java.util.stream.IntStream;

public class CheckPalindrome {
  boolean checkPalindrome(String inputString) {
    long undesiredCharCount = IntStream.rangeClosed(0, inputString.length() / 2)
        .filter(i -> inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1))
        .count();

    return undesiredCharCount == 0;
  }
}
