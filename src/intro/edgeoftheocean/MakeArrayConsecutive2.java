package intro.edgeoftheocean;

import java.util.stream.IntStream;

public class MakeArrayConsecutive2 {
  int makeArrayConsecutive2(int[] statues) {
    int minValue = IntStream.of(statues).min().orElse(-1);
    int maxValue = IntStream.of(statues).max().orElse(-1);
    int desiredCapacity = maxValue - minValue;

    return desiredCapacity - statues.length + 1;
  }
}
