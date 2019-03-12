package intro.eruptionoflight;

public class BuildPalindrome {
  String buildPalindrome(String st) {
    if (isPalindrome(st))
      return st;

    StringBuilder sbOriginalString = new StringBuilder(st);
    String reversedString = sbOriginalString.reverse().toString();

    for(int i = 1; i < st.length(); i++) {
      String candidateString = st + reversedString.substring(st.length() - i);
      if (isPalindrome(candidateString))
        return candidateString;
    }

    return st;
  }

  boolean isPalindrome(String original){
    final int stringLength = original.length();
    for (int i = 0; i <= original.length() / 2; i++) {
      if (original.charAt(i) != original.charAt(stringLength - i - 1))
        return false;
    }

    return true;
  }
}
