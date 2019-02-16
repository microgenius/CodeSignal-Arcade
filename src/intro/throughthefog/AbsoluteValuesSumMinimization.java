package intro.throughthefog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class AbsoluteValuesSumMinimization {
  int absoluteValuesSumMinimization(Integer[] a) {
    Map<Integer, Integer> sumCache = new HashMap<>();

    int bestSum = Integer.MAX_VALUE;
    for (int nextVal : a) {
      if (sumCache.containsKey(nextVal))
        continue;

      int absSummary = Arrays.stream(a)
          .filter(x -> x != nextVal)
          .mapToInt(y -> Math.abs(y - nextVal))
          .sum();

      if (absSummary >= bestSum) {
        absSummary = Integer.MAX_VALUE;
      } else {
        bestSum = absSummary;
      }

      sumCache.put(nextVal, absSummary);
    }

    return sumCache.entrySet()
        .stream()
        .min(Comparator.comparingInt(Map.Entry::getValue))
        .get()
        .getKey();
  }
}
