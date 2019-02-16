package intro.throughthefog;

public class DepositProfit {
  int depositProfit(int deposit, int rate, int threshold) {
    int year = 0;
    float increasedMoney = deposit;

    for(;increasedMoney < threshold; year++){
      increasedMoney += increasedMoney * rate/100;
    }

    return year;
  }
}
