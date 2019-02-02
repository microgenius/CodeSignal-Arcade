package intro.smoothsailing;

import java.util.*;

public class SortByHeight {
  int[] sortByHeight(int[] a) {
    Set<Integer> treeIndexes = new HashSet<>();
    List<Integer> valueSet = new ArrayList<>();

    for (int i = 0; i < a.length; i++) {
      if (a[i] == -1)
        treeIndexes.add(i);
      else
        valueSet.add(a[i]);
    }

    Collections.sort(valueSet);

    int[] result = new int[a.length];
    Iterator<Integer> valueIterator = valueSet.iterator();
    for (int i = 0; i < a.length; i++) {
      if (treeIndexes.contains(i)) {
        result[i] = -1;
        continue;
      }

      result[i] = valueIterator.next();
    }

    return result;
  }
}
