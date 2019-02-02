package intro.edgeoftheocean;

import java.util.HashSet;
import java.util.Set;

public class MatrixElementsSum {
  int matrixElementsSum(int[][] matrix) {
    int totalCost = 0;
    Set<Integer> hauntedLines = new HashSet<Integer>();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (hauntedLines.contains(j))
          continue;

        if (matrix[i][j] == 0) {
          hauntedLines.add(j);
          continue;
        }

        totalCost += matrix[i][j];
      }
    }

    return totalCost;
  }
}
