package intro.rainsofreason;

public class VariableName {
  boolean variableName(String name) {
    // First char can not be digit
    if (Character.isDigit(name.charAt(0)))
      return false;

    return name.chars().allMatch(intVal -> isCharacterValid(intVal));
  }

  private boolean isCharacterValid(int asciiVal){
    return (asciiVal >= 48 && asciiVal <= 57)
        || (asciiVal >= 65 && asciiVal <= 90)
        || (asciiVal >= 97 && asciiVal <= 122)
        || asciiVal == 95;
  }
}
