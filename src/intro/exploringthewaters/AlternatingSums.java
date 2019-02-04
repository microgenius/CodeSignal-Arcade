package intro.exploringthewaters;

public class AlternatingSums {
  int[] alternatingSums(int[] a) {
    int sumOfFirstTeam = 0;
    int sumOfSecondTeam = 0;

    for(int i = 0; i < a.length; i++){
      if (isEven(i))
        sumOfFirstTeam += a[i];
      else
        sumOfSecondTeam += a[i];
    }

    return new int[] { sumOfFirstTeam, sumOfSecondTeam };
  }

  public boolean isEven(int number){
    return number % 2 == 0;
  }
}
