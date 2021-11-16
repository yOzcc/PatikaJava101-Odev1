import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number :");
        int number1 = input.nextInt();

        System.out.println("enter the second number :");
        int number2 = input.nextInt();

        int ebob = 1;
        int i = number1;

        while (i>=1){
            i--;
            if(number1%i == 0 && number2%i == 0){
                ebob = i;
                System.out.println("ebob = " + ebob);
                break;
            }
        }
        System.out.println("ekok : "+ (number1*number2)/ebob);
    }
}
