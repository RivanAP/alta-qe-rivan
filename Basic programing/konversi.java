import java.util.Scanner;

public class konversi {
    public static void main(String[] args) {
        Scanner ujian = new Scanner(System.in);
        System.out.println("Masukkan  Nilai = ");
        int a = ujian.nextInt();
        if (a>=80&&a<=100)
        {
            System.out.println("Nilai Anda A");
        }
        else if (a>=65&&a<=79)
        {
            System.out.println("Nilai Anda B+");
        }
        else if (a>=50&&a<=64)
        {
            System.out.println("Nilai Anda B");
        }
        else if (a>=35&&a<=49)
        {
            System.out.println("Nilai Anda C");
        }
        else if (a>=0&&a<=34)
        {
            System.out.println("Nilai Anda D");
        }
        else if (a<0&&a>100)
         {
            System.out.println("Nilai Anda invalid");
        }

    }


}

