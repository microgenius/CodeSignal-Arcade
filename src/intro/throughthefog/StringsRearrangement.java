package intro.throughthefog;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class StringsRearrangement {
  static boolean stringsRearrangement(String[] inputArray) {
    StringReArrangementParam firstParam = new StringReArrangementParam();
    firstParam.originalInput = inputArray;
    firstParam.processCount = 0;
    firstParam.skipIndex = new HashSet<>();
    firstParam.previousValue = "";

    return canDifferenceByOneApply(firstParam);
  }

  static boolean canDifferenceByOneApply(StringReArrangementParam param) {
    if (param.processCount == param.originalInput.length) {
      return true;
    }

    for (int i = 0; i < param.originalInput.length; i++) {
      if (!param.skipIndex.contains(i) && calcDifferenceCount(param.previousValue, param.originalInput[i]) == 1) {
        StringReArrangementParam recursiveParam = new StringReArrangementParam();
        recursiveParam.skipIndex = new HashSet<>(param.skipIndex);
        recursiveParam.skipIndex.add(i);

        recursiveParam.originalInput = param.originalInput;
        recursiveParam.previousValue = param.originalInput[i];
        recursiveParam.processCount = param.processCount + 1;

        if (canDifferenceByOneApply(recursiveParam))
          return true;
      }
    }

    return false;
  }

  static int calcDifferenceCount(String value1, String value2){
    if (value1.isEmpty() || value2.isEmpty())
      return 1;

    return (int) IntStream.range(0, value1.length())
        .filter(x -> value1.charAt(x) != value2.charAt(x))
        .count();
  }

  static class StringReArrangementParam {
    String[] originalInput;
    String previousValue;
    Set<Integer> skipIndex;
    int processCount;
  }
}
