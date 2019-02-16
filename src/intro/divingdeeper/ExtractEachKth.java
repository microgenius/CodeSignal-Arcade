package intro.divingdeeper;

import java.util.stream.IntStream;

public class ExtractEachKth {
  int[] extractEachKth(int[] inputArray, int k) {
    if (k > inputArray.length)
      return inputArray; // kTh element not available in input array

    if (k == 1)
      return new int[0]; // Result can only be empty array

    return IntStream.range(0, inputArray.length)
        .filter(x -> ((x + 1) % k) != 0)
        .map(index -> inputArray[index])
        .toArray();
  }
}
