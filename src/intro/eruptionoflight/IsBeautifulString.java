package intro.eruptionoflight;

import java.util.stream.IntStream;

public class IsBeautifulString {
  boolean isBeautifulString(String inputString) {
    int[] alphabet = IntStream.range(97, 123)
        .toArray();

    long previousCharCount = Integer.MAX_VALUE;
    for (int i = 0; i < alphabet.length; i++) {
      final int targetChar = alphabet[i];
      long targetCharCount = inputString.chars()
          .filter(c -> c == targetChar)
          .count();

      if (targetCharCount > previousCharCount)
        return false;

      previousCharCount = targetCharCount;
    }

    return true;
  }
}
