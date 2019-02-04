package intro.islandofknowledge;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AvoidObstacles {
  int avoidObstacles(int[] inputArray) {
    return IntStream.range(2, Integer.MAX_VALUE)
        .filter(step ->
            Arrays.stream(inputArray)
                .allMatch(arrayVal -> arrayVal % step != 0))
        .findFirst()
        .orElse(-1);
  }
}
