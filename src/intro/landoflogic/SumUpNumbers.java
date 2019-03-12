package intro.landoflogic;

import java.util.Arrays;

public class SumUpNumbers {
  int sumUpNumbers(String inputString) {
    String[] itemAmounts = inputString.split("[^0-9]");
    if (itemAmounts.length == 0)
      return 0;

    return Arrays.stream(itemAmounts)
        .filter(x -> !x.isEmpty())
        .mapToInt(Integer::parseInt)
        .sum();
  }
}
