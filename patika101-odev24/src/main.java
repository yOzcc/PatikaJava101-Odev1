import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double total=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number :");
        double number = input.nextDouble();

        for(double i=1; i<=number; i++){
            total = total + 1/i;
        }

        System.out.println("result : " + total);
    }
}
