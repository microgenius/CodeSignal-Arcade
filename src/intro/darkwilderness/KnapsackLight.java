package intro.darkwilderness;

public class KnapsackLight {
  int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
    if (weight1 > maxW && weight2 > maxW)
      return 0;

    if ((weight1 + weight2) <= maxW)
      return value1 + value2;

    if ((value1 > value2 && maxW >= weight1) || (weight2 > maxW))
      return value1;

    return value2;
  }
}
