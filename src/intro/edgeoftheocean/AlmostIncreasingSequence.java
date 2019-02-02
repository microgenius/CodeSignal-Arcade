package intro.edgeoftheocean;

public class AlmostIncreasingSequence {
  boolean almostIncreasingSequence(int[] sequence) {
    int flag = 0;
    int i = 0;
    while (i < sequence.length - 1) {
      if (sequence[i] < sequence[i + 1]) {
        i++;
      } else {
        flag++;
        if (i > 0 && i + 2 < sequence.length && sequence[i + 1] <= sequence[i - 1] && sequence[i + 2] <= sequence[i]) {
          flag++;
        } else {
          i++;
        }
        if (flag > 1) {
          return false;
        }
      }
    }
    return true;
  }
}
