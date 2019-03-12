package intro.rainbowofclarity;

public class DeleteDigit {
  int deleteDigit(int n) {
    String digitStr = String.valueOf(n);
    int index = 0;

    for(; index < digitStr.length() - 1; index++)
    {
      if(digitStr.charAt(index) < digitStr.charAt(index + 1))
        break;
    }

    return Integer.valueOf(digitStr.substring(0, index) + digitStr.substring(index + 1));
  }
}
