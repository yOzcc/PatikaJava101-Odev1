import java.util.Scanner;


public class main {

    public static void main(String[] args) {

        int number = 0, prime;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = input.nextInt();

        prime = isPrime(number, number/2);
        if (prime==1){
            System.out.println(number +" number is prime.");
        }
        else {
            System.out.println(number +" number is not prime.");
        }
    }

    private static int isPrime(int number, int i){
        if(i==1) {
            return 1;
        }
        else {
            if (number%i==0){
                return 0;
            }
            else return isPrime(number,i-1);
        }
    }



}
