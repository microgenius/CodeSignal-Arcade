package intro.islandofknowledge;

public class IsIPv4Address {
  boolean isIPv4Address(String inputString) {
    String[] ipStringParts = parseIPv4String(inputString);
    if (ipStringParts.length != 4)
      return false;

    for(String part : ipStringParts){
      if (!isIPv4StringPartValid(part))
        return false;
    }

    return true;
  }

  public String[] parseIPv4String(String address) {
    return address.split("\\.");
  }

  public boolean isIPv4StringPartValid(String ipStringPart){
    if (ipStringPart == null || ipStringPart.isEmpty())
      return false;
    try{
      Integer ipPartValue = Integer.valueOf(ipStringPart);

      return ipPartValue >= 0 && ipPartValue <= 255;
    } catch(Exception e) {
      return false;
    }
  }
}
