package intro.landoflogic;

public class DigitsProduct {
  int digitsProduct(int product) {
    //We add 11 for when product is equal to 0
    final int FINAL_REACH_POINT = product * product + 11;
    int number = 1;

    while (number < FINAL_REACH_POINT) {
      if (checkNumberDigitProduct(number) == product)
        return number;

      number++;
    }

    return -1;
  }

  int checkNumberDigitProduct(int number) {
    int result = 1;

    while (number > 0) {
      result = result * (number % 10);
      number = number / 10;
    }

    return result;
  }
}