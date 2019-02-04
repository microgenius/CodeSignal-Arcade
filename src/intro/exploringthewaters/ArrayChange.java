package intro.exploringthewaters;

public class ArrayChange {
  int arrayChange(int[] inputArray) {
    int totalStep = 0;
    for (int i = 1; i < inputArray.length; i++) {
      int pastValue = inputArray[i - 1];
      int currentValue = inputArray[i];

      if (currentValue > pastValue)
        continue;

      int difference = pastValue - currentValue;
      totalStep += (difference + 1);

      inputArray[i] = currentValue + difference + 1;
    }

    return totalStep;
  }
}
