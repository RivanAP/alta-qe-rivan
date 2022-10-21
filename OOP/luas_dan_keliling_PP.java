import java.util.Scanner;

public class luas_dan_keliling_PP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar,luas , keliling;
        System.out.println("masukan panjang =");
        panjang = input.nextInt();
        System.out.println("masukan lebar =");
        lebar = input.nextInt();

        luas = panjang * lebar;
        keliling = 2 *(panjang + lebar);
        System.out.println("luas persegi panjang ="+luas);
        System.out.println("keliling persegi panjang ="+keliling);
    }
}
