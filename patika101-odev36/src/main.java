import java.util.Scanner;

public class main {

    static int exponentialNumber(int b, int e) {

        int result = 1;

        if (e == 0){
            return 1;
        }
        if (b == 0 && e == 0){
            System.out.println("Base and exponent cannot be zero.");
        }

        b *= exponentialNumber(b,e-1);
        return b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of number : ");
        int base = input.nextInt();
        System.out.println("Enter the exponent of the number : ");
        int exponent = input.nextInt();

        System.out.println(exponentialNumber(base,exponent));
    }
}
