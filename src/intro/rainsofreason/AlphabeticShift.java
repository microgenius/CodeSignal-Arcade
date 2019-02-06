package intro.rainsofreason;

public class AlphabeticShift {
  String alphabeticShift(String inputString) {
    char[] inputChars = inputString.toCharArray();

    for (int i = 0; i < inputChars.length; i++) {
      int newValue = ((int)inputChars[i]) + 1;
      if (newValue == 123 || newValue == 91)
        newValue -= 26;

      inputChars[i] = (char) newValue;
    }

    return new String(inputChars);
  }
}
