import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int number;
        int sum=0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Please enter number : ");
            number = input.nextInt();
            if(number % 2 == 0 && number % 4 == 0){
                System.out.println("even number and multiple of 4.");
                sum+=number;
            }
        } while (number % 2 == 0);

        System.out.println("sum of entered numbers : " + sum);
    }
}
