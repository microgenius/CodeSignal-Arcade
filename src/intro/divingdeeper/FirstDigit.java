package intro.divingdeeper;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FirstDigit {
  char firstDigit(String inputString) {
    OptionalInt firstDigitIndex = IntStream.range(0, inputString.length())
        .filter(x -> Character.isDigit(inputString.charAt(x)))
        .findFirst();

    if (firstDigitIndex.isPresent())
      return inputString.charAt(firstDigitIndex.getAsInt());

    return ' ';
  }
}
