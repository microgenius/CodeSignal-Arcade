package intro.smoothsailing;

import java.util.Comparator;
import java.util.stream.Stream;

public class AllLongestStrings {
  String[] allLongestStrings(String[] inputArray) {
    final int maxElementSize = Stream.of(inputArray)
        .map(String::length)
        .max(Comparator.naturalOrder())
        .orElse(0);

    return Stream.of(inputArray)
        .filter(x -> x.length() == maxElementSize)
        .toArray(String[]::new);
  }
}
