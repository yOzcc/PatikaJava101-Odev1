import java.util.Scanner;
import java.lang.Math;

public class main {

    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number : ");
        number = input.nextInt();
        System.out.println("exponents of 4 :");
        for(int i=1; i<=number; i*=4){
            System.out.println(i);
        }
        System.out.println("*************************");
        System.out.println("exponents of 5 :");
        for(int j=1;j<=number;j*=5){
            System.out.println(j);
        }
    }
}
