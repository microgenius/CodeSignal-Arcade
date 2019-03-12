package intro.eruptionoflight;

import java.util.Arrays;

public class ElectionsWinners {
  int electionsWinners(int[] votes, int k) {
    int highestVote = Arrays.stream(votes)
        .max()
        .getAsInt();

    if (k == 0) {
      //Find the winner, if there is only one
      int winnerCount = (int) Arrays.stream(votes)
          .filter(x -> x == highestVote)
          .count();

      //if there is more than one winner we will return 0 (Draw)
      return winnerCount > 1 ? 0 : winnerCount;
    }

    int possibleWinnerCount = (int) Arrays.stream(votes)
        .filter(x -> (x + k) > highestVote)
        .count();

    return possibleWinnerCount;
  }
}
