package intro.rainbowofclarity;

public class ChessKnight {
  int chessKnight(String cell) {
    int[] generalMovementRule = new int[] { -1, 1 };
    int[] knightPosition = convertToChessPoint(cell);

    int possibleMovementCount = 0;
    for (int row = 0; row < generalMovementRule.length; row++) {
      for (int column = 0; column < generalMovementRule.length; column++) {
        possibleMovementCount += calculateKnightMovementForRule(generalMovementRule[row],
            generalMovementRule[column],
            knightPosition);
      }
    }

    return possibleMovementCount;
  }

  int calculateKnightMovementForRule(int rowRule, int columnRule, int[] originalCell) {
    int[] knightMovementRule = new int[] { 1, 2 };
    int movementCount = 0;

    int[] firstMovement = new int[] { (rowRule * knightMovementRule[0]) + originalCell[0],
        (columnRule * knightMovementRule[1]) + originalCell[1] };
    if (isChessPointInTableRange(firstMovement))
      movementCount++;

    int[] secondMovement = new int[] { (rowRule * knightMovementRule[1]) + originalCell[0],
        (columnRule * knightMovementRule[0]) + originalCell[1] };

    if (isChessPointInTableRange(secondMovement))
      movementCount++;

    return movementCount;
  }

  int[] convertToChessPoint(String cell) {
    String lowerString = cell.toLowerCase();

    int row = lowerString.charAt(0) - 'a';
    int column = lowerString.charAt(1) - '1';

    return new int[]{ row, column };
  }

  boolean isChessPointInTableRange(int[] cellPosition){
    for (int i = 0; i <= 1; i++) {
      if (cellPosition[i] < 0 || cellPosition[i] > 7)
        return false;
    }

    return true;
  }
}
