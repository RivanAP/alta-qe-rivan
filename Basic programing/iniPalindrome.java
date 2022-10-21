import java.util.Scanner;

public class iniPalindrome {
    static boolean Palindrome(String str)
    {
        int x = 0, n = str.length() - 1;
        while (x < n) {
            if (str.charAt(x) != str.charAt(n))
                return false;
            x++;
            n--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String str = input.nextLine();
        str = str.toLowerCase();
        if (Palindrome(str))
            System.out.print("true");
        else
            System.out.print("false");
    }
}
