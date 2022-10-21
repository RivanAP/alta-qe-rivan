import java.util.Scanner;

public class luas_dan_keliling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi ,luas_persegi,keliling_persegi;

        System.out.println("masukan sisi :");
        sisi = input.nextInt();

        luas_persegi= sisi * sisi;
        keliling_persegi = 4 * sisi;

        System.out.println("luas persegi :"+luas_persegi);
        System.out.println("keliling persegi :"+keliling_persegi);

        System.out.println("");
        {
            Scanner angka = new Scanner(System.in);
            float alas , tinggi, luas , keliling;
            System.out.printf("masukan alas =");
            alas = angka.nextInt();
            System.out.printf("masukan tinggi =");
            tinggi = angka.nextInt();

            luas = 0.5f * alas * tinggi ;
            keliling = 3 * alas;
            System.out.println("luas segitiga = "+luas);
            System.out.println("keliling segitiga ="+keliling);

        }
        System.out.println("");
        {
            Scanner masuk = new Scanner(System.in);
            int panjang_PP, lebar_pp,luas_pp , keliling_pp;
            System.out.println("masukan panjang =");
            panjang_PP = masuk.nextInt();
            System.out.println("masukan lebar =");
            lebar_pp = masuk.nextInt();

            luas_pp = panjang_PP * lebar_pp;
            keliling_pp= 2 *(panjang_PP + lebar_pp);
            System.out.println("luas persegi panjang ="+luas_pp);
            System.out.println("keliling persegi panjang ="+keliling_pp);
        }


    }
}
