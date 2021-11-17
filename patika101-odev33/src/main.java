import java.util.Scanner;

public class main {

    static boolean isPalindrom(int number){
    int lastNumber, reverseNumber = 0, temp= number;

    while (temp !=0){
        lastNumber = temp % 10;
        reverseNumber = (reverseNumber*10) + lastNumber;
        temp /=10;
    }
    if (number==reverseNumber){
        return true;
    }
    else
        return false;
    }
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        System.out.println("Is this number a palindromic number?");
        System.out.println(isPalindrom(number));


    }
}