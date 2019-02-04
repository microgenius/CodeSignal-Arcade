package intro.exploringthewaters;

public class AddBorder {
  String[] addBorder(String[] picture) {
    int originalLengthOfString = picture[0].length();
    String[] output = new String[picture.length + 2];

    for (int i = 0; i < output.length; i++) {
      if (i == 0 || i == output.length - 1){
        output[i] = createLineString(originalLengthOfString + 2);
      } else {
        output[i] = "*" + picture[i - 1] + "*";
      }
    }

    return output;
  }

  public String createLineString(int size) {
    char[] lineStringCharArr = new char[size];
    for(int i = 0; i < size; i++) {
      lineStringCharArr[i] = '*';
    }

    return new String(lineStringCharArr);
  }
}
