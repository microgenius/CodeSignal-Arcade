package intro.darkwilderness;

public class BishopAndPawn {
  /* Short Answer
boolean bishopAndPawn(String bishop, String pawn) {
    if(bishop.charAt(0) - pawn.charAt(0) == bishop.charAt(1) - pawn.charAt(1) ||
       bishop.charAt(0) - pawn.charAt(0) == -bishop.charAt(1) + pawn.charAt(1))
        return true;
    return false;
}
*/

  boolean bishopAndPawn(String bishop, String pawn) {
    int[] bishopCoordinate = convertToChessPoint(bishop);
    int[] pawnCoordinate = convertToChessPoint(pawn);

    return canCapture(bishopCoordinate, pawnCoordinate);
  }

  int[] convertToChessPoint(String chessCoordinate){
    String lowerCoordinate = chessCoordinate.toLowerCase();

    int rowIndex = lowerCoordinate.charAt(0) - 'a';
    int columnIndex = lowerCoordinate.charAt(1) - '1';

    return new int[] { rowIndex, columnIndex };
  }

  boolean canCapture(int[] source, int[] target){
    for (int i = -1; i <= 1; i++) {
      for (int j = -1; j <= 1; j++) {
        if (i == 0 && j == 0 || Math.abs(i) != Math.abs(j))
          continue;

        int[] newCoordinate = new int[]{source[0] + i, source[1] + j};
        if (!isCoordinateInRange(newCoordinate))
          continue;

        if (newCoordinate[0] == target[0] && newCoordinate[1] == target[1])
          return true;

        //We will try to capture pawn in fixed movement
        int startStep = 1;
        while(true) {
          int[] newFixedMovCoordinate = new int[]{source[0] + (i * (startStep + 1)), source[1] + (j* (startStep + 1))};
          if (!isCoordinateInRange(newFixedMovCoordinate)) //Try each step to get out of range
            break;

          if (newFixedMovCoordinate[0] == target[0] && newFixedMovCoordinate[1] == target[1])
            return true;

          startStep++;
        }
      }
    }

    return false;
  }

  boolean isCoordinateInRange(int[] chessCoordinate){
    return chessCoordinate[0] < 8 && chessCoordinate[0] >= 0 && chessCoordinate[1] < 8 && chessCoordinate[1] >= 0;
  }
}
