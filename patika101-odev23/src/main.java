import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int number = 0,sum = 0;

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = read.nextInt();

        while (num !=0){
            sum = (num % 10) + sum;
            num = num / 10;
            ++number;
        }

        System.out.println("digit sum : " + sum);



    }
}
