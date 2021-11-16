import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int number = input.nextInt();
        int sayac = 0;

        for(int i=1 ; i<number ; i++){
            if(number%i == 0){
                sayac = sayac + i;
            }
        }
        if (sayac == number){
            System.out.println("This number is a perfect number.");
        }
        else{
            System.out.println("This number is not a perfect number.");
        }


    }
}
