package intro.rainsofreason;

import java.util.stream.IntStream;

public class ArrayReplace {
  int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
    IntStream.range(0, inputArray.length)
        .filter(x -> inputArray[x] == elemToReplace)
        .forEach(y -> inputArray[y] = substitutionElem);

    return inputArray;
  }
}
