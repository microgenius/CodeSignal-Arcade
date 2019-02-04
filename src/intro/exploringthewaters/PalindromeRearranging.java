package intro.exploringthewaters;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {
  boolean palindromeRearranging(String inputString) {
    Map<Character, Integer> uniqueCharSet = new HashMap<>();
    for (int i = 0; i < inputString.length(); i++) {
      Integer charCount = uniqueCharSet.get(inputString.charAt(i));
      if (charCount == null)
        charCount = 0;

      charCount++;
      uniqueCharSet.put(inputString.charAt(i), charCount);
    }

    long oddCharCount = uniqueCharSet
        .values()
        .stream()
        .filter(x -> !isEven(x))
        .count();

    return oddCharCount <= 1;
  }

  public boolean isEven(int number) {
    return number % 2 == 0;
  }
}
