package intro.rainsofreason;

public class EvenDigitsOnly {
  boolean evenDigitsOnly(int n) {
    String stringNumber = Integer.toString(n);

    return stringNumber.chars()
        .mapToObj(c -> charToInt((char) c))
        .allMatch(d -> isEven(d));
  }

  private boolean isEven(int number) {
    return number % 2 == 0;
  }

  private int charToInt(char character) {
    return Character.getNumericValue(character);
  }
}
