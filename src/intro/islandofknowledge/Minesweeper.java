package intro.islandofknowledge;

public class Minesweeper {
  int[][] minesweeper(boolean[][] matrix) {
    Range mineRange = Range.of(matrix.length, matrix[0].length);

    int[][] mineDetector = new int[mineRange.x][mineRange.y];

    for (int row = 0; row < mineRange.x; row++) {
      for (int col = 0; col < mineRange.y; col++) {
        if (matrix[row][col]) {
          //Try to find edges
          Point minePoint = Point.of(row, col);
          increaseMineLevel(mineDetector, mineRange, minePoint);
        }
      }
    }

    return mineDetector;
  }

  public void increaseMineLevel(int[][] mineDetector, Range fieldRange, Point minePoint){
    //We will warn +1 and -1 level edges for mine
    for (int i = -1; i <= 1; i++) {
      for (int j = -1; j <= 1; j++) {
        if (i == 0 && j == 0) continue;

        Point warningPoint = Point.of(minePoint.x + i, minePoint.y + j);
        if (isCoordinateInRange(warningPoint, fieldRange))
          mineDetector[warningPoint.x][warningPoint.y]++;
      }
    }
  }

  public boolean isCoordinateInRange(Point point, Range range){
    return point.x >= 0 && point.x < range.x && point.y >= 0 && point.y < range.y;
  }

  static class Point {
    int x;
    int y;

    public static Point of(int x, int y) {
      Point point = new Point();
      point.x = x;
      point.y = y;
      return point;
    }
  }

  static class Range {
    int x;
    int y;

    public static Range of(int x, int y) {
      Range range = new Range();
      range.x = x;
      range.y = y;
      return range;
    }
  }
}
