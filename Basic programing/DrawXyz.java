public class DrawXyz{
  public static void DrawXYZ(int n ) {
      int angka = 1;

      for (int i = 1; i<= n; i++ ){
          for (int j = 1; j <= n ;j++ ){
              if (angka % 3 == 0) {
                  System.out.print(" X ");
              } else if (angka % 2 == 0) {
                  System.out.print(" Y ");
              } else if (angka % 2 == 1) {
                  System.out.print(" Z ");
              }
              angka++;
          }
          System.out.println();
      }
      System.out.println();
  }
    public static void main(String[] args) {
      DrawXYZ(5);
    }

    }

