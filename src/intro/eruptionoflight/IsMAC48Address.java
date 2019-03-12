package intro.eruptionoflight;

import java.util.Arrays;

public class IsMAC48Address {
  /**
   * Failed Case -> 0-125-11-A1-F1-23
   */
  boolean isMAC48Address(String inputString) {
    String[] macAddressParts = inputString.split("-");
    if (macAddressParts.length != 6)
      return false;

    long correctPartCount = Arrays.stream(macAddressParts)
        .filter(x -> x.length() == 2)
        .filter(part -> part.chars().allMatch(c -> isMAC48CharInAsciiRange((char) c)))
        .count();

    return correctPartCount == 6 && inputString.length() == 17;
  }

  boolean isMAC48CharInAsciiRange(char c){
    return (c >= 'A' && c <= 'F')  || (c >= '0' && c <= '9');
  }
}
