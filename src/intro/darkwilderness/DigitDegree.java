package intro.darkwilderness;

public class DigitDegree {
  int digitDegree(int n) {
    if (n < 10)
      return 0;

    return reduceDigit(String.valueOf(n), 0);
  }

  int reduceDigit(String numberString, int currentDegree){
    if (numberString.length() == 1)
      return currentDegree;

    int sumOfDigits = 0;
    for (int i = 0; i < numberString.length(); i++){
      sumOfDigits += numberString.charAt(i) - '0'; // Convert ascii value to real value
    }

    return reduceDigit(String.valueOf(sumOfDigits), currentDegree + 1);
  }
}
