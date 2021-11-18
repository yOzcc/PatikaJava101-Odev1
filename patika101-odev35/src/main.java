import java.util.Scanner;

public class main {

    static void plus() {
        Scanner input = new Scanner(System.in);
        int number, result= 0, i = 1;
        while (true) {
            System.out.println(i++ + ". number : ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter? ");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.println(i + ". number");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        int number, i = 1, result = 1;

        while (true) {
            System.out.println(i++ + ". number : ");
            number = input.nextInt();

            if (number == 1) {
                break;
            }
            if (number == 0) {
                result = 0;
                break;
            }

            result *= number;
        }
        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        System.out.println(" How many numbers will you enter? ");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.println(i + ". number : ");
            number = input.nextInt();

            if (i != 1 && number == 0) {
                System.out.println("divisor cannot be 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the number : ");
        int base = input.nextInt();
        System.out.println("Enter the exponent of the number : ");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Result : " + result);
    }

    static void modulo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = input.nextInt();
        System.out.println("what number will the mod be?");
        int mod = input.nextInt();

        if (mod!=1 && n == 0) {
            System.out.println("mode cannot be 0.");
        }
        int result = n%mod;
        System.out.println("Result : "+ result);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        int length = input.nextInt();
        System.out.println("Enter the width of the rectangle : ");
        int width = input.nextInt();
        int resultArea = (width*length);
        int resultPerimeter = (width+length)*2;
        System.out.println("Area of rectangle : " + resultArea);
        System.out.println("Perimeter of rectangle : " + resultPerimeter);

    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int num = input.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Result : "+ result);
    }
        public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "Select the action to take.\n"
                + " 1 - Addition :\n"
                + " 2 - Subtraction :\n"
                + " 3 - Multiplication :\n"
                + " 4 - Division :\n"
                + " 5 - Exponentiation :\n"
                + " 6 - Factorial :\n"
                + " 7 - Modulo :\n"
                + " 8 - Rectangular area and perimeter :\n"
                + " 0 - Exit";


        do {
            System.out.println(menu);
            select = scan.nextInt();
            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulo();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("You entered an incorrect value. Please try again.");

            }

        }while (select!=0);
    }
}