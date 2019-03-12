package intro.rainbowofclarity;

public class LineEncoding {
  String lineEncoding(String s) {
    StringBuilder sbEncodedString = new StringBuilder();
    int charOccurrence = 1;

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i - 1) != s.charAt(i)) {
        if (charOccurrence > 1)
          sbEncodedString.append(charOccurrence);

        sbEncodedString.append(s.charAt(i - 1));
        charOccurrence = 1;
        continue;
      }

      charOccurrence++;
    }

    //For last Character
    if (charOccurrence > 1)
      sbEncodedString.append(charOccurrence);

    sbEncodedString.append(s.charAt(s.length() - 1));

    return sbEncodedString.toString();
  }
}
