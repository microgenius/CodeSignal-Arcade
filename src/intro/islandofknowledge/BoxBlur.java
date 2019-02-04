package intro.islandofknowledge;

public class BoxBlur {
  int[][] boxBlur(int[][] image) {
    int newRowLength = image[0].length - 2;
    int newColumnLength = image.length - 2;

    int[][] blurredImage = new int[newColumnLength][];

    for(int i = 0;i < newColumnLength; i++){
      blurredImage[i] = new int[newRowLength];
      for(int j = 0;j < newRowLength;j++){
        int upperRow = image[i][j] + image[i][j+1] + image[i][j+2];
        int middleRow = image[i+1][j] + image[i+1][j+1] + image[i+1][j+2];
        int lowerRow = image[i+2][j] + image[i+2][j+1] + image[i+2][j+2];

        blurredImage[i][j] = (upperRow + middleRow + lowerRow) / 9;
      }
    }

    return blurredImage;
  }
}
