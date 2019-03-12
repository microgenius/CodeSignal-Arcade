package intro.landoflogic;

public class MessageFromBinaryCode {
  String messageFromBinaryCode(String code) {
    if (code == null || code.trim().isEmpty())
      return code;

    StringBuilder sbResult = new StringBuilder();
    for (int i = 0; i < code.length(); i += 8) {
      if (i + 8 > code.length())
        return sbResult.toString();

      String binaryPart = code.substring(i, i + 8);
      char decodedChar = (char) Integer.parseInt(binaryPart, 2);
      sbResult.append(decodedChar);
    }

    return sbResult.toString();
  }
}
