package intro.exploringthewaters;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalindromeRearranging {
  boolean palindromeRearranging(String inputString) {
    final Map<Character, Long> uniqueCharSet = inputString
        .chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    long oddCharCount = uniqueCharSet
        .values()
        .stream()
        .filter(x -> !isEven(x))
        .count();

    return oddCharCount <= 1;
  }

  boolean isEven(long number) {
    return number % 2 == 0;
  }
}
