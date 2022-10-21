import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int angka1, angka2, bilangan ,hasil = 0;
            System.out.println("(1)Perkalian");
            System.out.println("(2)Pembagian");
            System.out.println("(3)Penjumlahan");
            System.out.println("(4)Pengurangan");
            System.out.print("masukan angka pertama : ");
            angka1=input.nextInt();
            System.out.print("masukan angka kedua : ");
            angka2=input.nextInt();
            System.out.print("Pilih Operasi: ");
            bilangan=input.nextInt();

            switch (bilangan){
                case 1 : hasil=angka1*angka2;break;
                case 2 : hasil=angka1/angka2;break;
                case 3 : hasil=angka1+angka2;break;
                case 4 : hasil=angka1-angka2;break;
                default : System.out.println("Salah memasukan pilihan");
            }

            System.out.println("Hasil :"+hasil);
        }

}
