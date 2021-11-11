import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int total = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the number :");
        int number = input.nextInt();

        System.out.println("What will be the exponent of the number? ");
        int exponent = input.nextInt();

        for (int i=0; i<exponent; i++){
            total = total * number;

        }

        System.out.println("Result : " + total);
    }
}
