import java.util.Scanner;

public class palindromee {
    public static void main(String[] args) {
        Scanner coba = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String str = coba.nextLine();
        char[] kalimat = str.toCharArray();
        String kata = "";
        for (char x : kalimat) {
            kata = x + kata;
        }
        str = str.toLowerCase();
        if (!str.equals(kata)){
            System.out.print("False");
        }
        else
        System.out.print("True");
    }

}
