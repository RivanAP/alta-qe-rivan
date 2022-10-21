import java.util.Scanner;

public class bilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i;
        boolean angka_prima = true;
        System.out.print("masukan angka: ");
        n = input.nextInt();
        if (n == 0 || n == 1) {
            angka_prima = false;
        }
        else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    angka_prima = false;
                    break;
                }
            }
        }

        if (angka_prima)
            System.out.println( n + " prima (true)");
        else
            System.out.println( n + " bukan prima (false)");
    }
}
