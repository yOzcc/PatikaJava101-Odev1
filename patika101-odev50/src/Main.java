import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrome("anastas mum satsana"));
    }
}
