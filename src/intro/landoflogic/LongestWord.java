package intro.landoflogic;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
  String longestWord(String text) {
    String[] words = text.split("[^a-zA-Z]");

    return Arrays
        .stream(words)
        .max(Comparator.comparingInt(String::length))
        .orElse("");
  }
}
