package intro.thejourneybegins;

public class CenturyFromYear {
  int centuryFromYear(int year) {
    int absYear = ((int)year / 100) * 100;
    return absYear < year ? (absYear / 100) + 1 : absYear / 100;
  }
}
