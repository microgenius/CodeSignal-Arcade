package intro.darkwilderness;

public class GrowingPlant {
  int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
    int dayCount = 0;
    int plantHeight = 0;
    while (true) {
      dayCount++;

      plantHeight+= upSpeed;
      if (plantHeight >= desiredHeight)
        break;

      plantHeight -= downSpeed;
    }

    return dayCount;
  }
}
