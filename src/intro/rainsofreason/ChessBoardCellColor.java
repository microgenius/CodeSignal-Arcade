package intro.rainsofreason;

public class ChessBoardCellColor {
  boolean chessBoardCellColor(String cell1, String cell2) {
    int[][] chessBoard =
            {{0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0},
            {0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0},
            {0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0},
            {0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1,0}};

    int[] point1 = parseBoardCell(cell1);
    int[] point2 = parseBoardCell(cell2);

    return chessBoard[point1[0]][point1[1]] == chessBoard[point2[0]][point2[1]];
  }

  private int[] parseBoardCell(String cell) {
    char[] cellArr = cell.toCharArray();
    int row = (int)(cell.charAt(0) - 'A');
    int col = (int)(cell.charAt(1) - '1');
    return new int[]{row, col};
  }
}
