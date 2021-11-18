import java.util.Scanner;

public class main {

    static int fibonacci(int number){
        if (number==1 || number==2) {
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number-2);
    }

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = number.nextInt();

        System.out.println(fibonacci(num));
    }
}
