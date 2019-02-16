package intro.divingdeeper;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayMaxConsecutiveSum {
  int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int maxSumValue = 0;
    for (int i = 0; i < inputArray.length; i++) {
      int maxIndex = i + k;
      if (maxIndex > inputArray.length)
        maxIndex = inputArray.length;

      OptionalInt sumValue = IntStream.range(i, maxIndex)
          .map(x -> inputArray[x])
          .reduce(Integer::sum);

      if (sumValue.isPresent() && sumValue.getAsInt() > maxSumValue)
        maxSumValue = sumValue.getAsInt();
    }

    return maxSumValue;
  }
}
