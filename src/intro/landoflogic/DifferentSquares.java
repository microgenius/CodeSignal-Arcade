package intro.landoflogic;

import java.util.HashSet;
import java.util.Set;

public class DifferentSquares {
  int differentSquares(int[][] matrix) {
    Set<Integer> uniqueValues = new HashSet<>();

    for (int row = 0; row < matrix.length - 1; row++) {
      for (int column = 0; column < matrix[row].length - 1; column++) {
        //Create flat value from matrix
        int value = matrix[row][column] * 1000
            + matrix[row + 1][column] * 100
            + matrix[row][column + 1] * 10
            + matrix[row + 1][column + 1];

        //Set keeps only unique values
        uniqueValues.add(value);
      }
    }

    return uniqueValues.size();
  }
}
