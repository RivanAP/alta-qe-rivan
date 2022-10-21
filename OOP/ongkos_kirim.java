import java.util.Scanner;

public class ongkos_kirim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float p,l,t,bobot,bobot2,bobot3;
        System.out.print("masukan panjang =");
        p = input.nextInt();
        System.out.print("masukan lebar =");
        l = input.nextInt();
        System.out.print("masukan tinggi =");
        t = input.nextInt();

        bobot = (p * l * t ) / 6000 ;
        bobot2 = bobot * 5000;
        bobot3 = bobot2 + 5000;
        if (bobot2<=50)
        {
            System.out.printf("ongkir 5000");
        }
        else
            if (bobot2>50)
            {
                System.out.printf("ongkir = "+bobot3);
            }

    }
}
