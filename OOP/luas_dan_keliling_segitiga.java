import java.util.Scanner;

public class luas_dan_keliling_segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       float alas , tinggi, luas , keliling;
        System.out.printf("masukan alas =");
        alas = input.nextInt();
        System.out.printf("masukan tinggi =");
        tinggi = input.nextInt();

        luas = 0.5f * alas * tinggi ;
        keliling = 3 * alas;
        System.out.println("luas segitiga = "+luas);
        System.out.println("keliling segitiga ="+keliling);

    }
}
