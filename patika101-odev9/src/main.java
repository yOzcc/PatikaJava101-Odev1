import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        number1 = input.nextInt();

        System.out.println("Enter the second number: ");
        number2 = input.nextInt();

        System.out.println("Your first number is : " + number1 +  "\nYour second number is : " + number2 + "\n");

        System.out.println("Select the operation : ");
        System.out.println("1-addition, 2-extraction, 3-multiplication, 4-division");
        select = input.nextInt();
        System.out.println("Your select is : " + select);

        switch (select){
            case 1:
                System.out.println("Result of the operation : " + (number1+number2));
                break;
            case 2:
                System.out.println("Result of the operation : " + (number1-number2));
                break;
            case 3:
                System.out.println("Result of the operation : " + (number1*number2));
                break;
            case 4:
                System.out.println("Result of the operation : " + (number1/number2));
                break;
            default:
                System.out.println("Please enter a valid value.");
                break;
        }

}}