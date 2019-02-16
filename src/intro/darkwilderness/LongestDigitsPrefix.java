package intro.darkwilderness;

import java.util.stream.IntStream;

public class LongestDigitsPrefix {
  String longestDigitsPrefix(String inputString) {
    int firstDigitIndex = IntStream.rangeClosed(0, inputString.length() - 1)
        .filter(i -> !Character.isDigit(inputString.charAt(i)))
        .findFirst()
        .orElse(inputString.length());

    if (firstDigitIndex == 0)
      return "";

    return inputString.substring(0, firstDigitIndex);
  }
}
