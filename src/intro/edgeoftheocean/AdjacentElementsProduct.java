package intro.edgeoftheocean;

import java.util.stream.IntStream;

public class AdjacentElementsProduct {
  int adjacentElementsProduct(int[] inputArray) {
    return IntStream.range(1, inputArray.length)
        .map(i -> inputArray[i] * inputArray[i - 1])
        .max()
        .orElse(0);
  }
}
