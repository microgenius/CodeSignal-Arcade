package intro.landoflogic;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {
  boolean sudoku(int[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      if (!isRowValid(grid, i)){
        return false;
      }

      for (int j = 0; j < grid[i].length; j += 3){
        if (!isColumnValid(grid, j)){
          return false;
        }

        if (i % 3 == 0 && !isInnerGridValid(grid, i, j)) {
          return false;
        }
      }
    }

    return true;
  }

  boolean isColumnValid(int[][] grid, int columnIndex) {
    Set<Integer> valueSet = new HashSet<>();

    for(int row = 0; row < 9; row++) {
      valueSet.add(grid[row][columnIndex]);
    }

    return valueSet.size() == 9;
  }

  boolean isRowValid(int[][] grid, int rowIndex) {
    Set<Integer> valueSet = new HashSet<>();

    for(int column = 0; column < 9; column++) {
      valueSet.add(grid[rowIndex][column]);
    }

    return valueSet.size() == 9;
  }

  boolean isInnerGridValid(int[][] grid, int startRowIndex, int startColumnIndex) {
    Set<Integer> valueSet = new HashSet<>();

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        valueSet.add(grid[startRowIndex + i][startColumnIndex + j]);
      }
    }

    return valueSet.size() == 9;
  }
}