package intro.eruptionoflight;

public class FindEmailDomain {
  String findEmailDomain(String address) {
    int symbolIndex = address.lastIndexOf("@");
    if (symbolIndex < 0)
      return "";

    return address.substring(symbolIndex + 1);
  }
}
