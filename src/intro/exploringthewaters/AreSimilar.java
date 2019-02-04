package intro.exploringthewaters;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AreSimilar {
  boolean areSimilar(int[] a, int[] b) {
    int lengthOfArray = a.length;

    List<Integer> differentItemIndexList = IntStream.range(0, lengthOfArray)
        .filter(i -> a[i] != b[i])
        .boxed()
        .collect(Collectors.toList());

    if (differentItemIndexList.size() <= 1)
      return true;
    else if (differentItemIndexList.size() == 2){
      int firstIndex = differentItemIndexList.get(0);
      int secondIndex = differentItemIndexList.get(1);

      return a[firstIndex] == b[secondIndex] && a[secondIndex] == b[firstIndex];
    }

    return false;
  }
}
