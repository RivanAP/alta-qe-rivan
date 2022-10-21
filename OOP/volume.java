import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       float  sisi, panjang ,lebar,tinggi,r,volume_balok,volume_tabung,volume_kubus;
       float phi = 3.14f;

        System.out.printf("masukan sisi =");
        sisi = input.nextInt();
        System.out.printf("masukan lebar = ");
        lebar = input.nextInt();
        System.out.printf("masukan panjang = ");
        panjang = input.nextInt();
        System.out.printf("masukan tinggi = ");
        tinggi = input.nextInt();
        System.out.printf("masukan  jari jari =");
        r = input.nextInt();



        volume_balok = panjang * lebar * tinggi;
        volume_kubus = sisi * sisi * sisi;
        volume_tabung = (phi * r * r )* tinggi;

        System.out.println("volume balok adalah "+volume_balok);
        System.out.println("volume kubus adalah "+volume_kubus);
        System.out.printf("volume tabung adalah "+volume_tabung);

    }
}
