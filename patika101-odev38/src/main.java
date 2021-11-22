import java.util.Scanner;

public class main {
    private static int counter;
    private static int Recursive(int number){
        System.out.println(number);
        counter++;
        if (number<=0){
            for (int i=1 ; i<counter ; i++){
                number+=5;
                System.out.println(number);
            }
        }
        else {
            return Recursive(number-5);}
        return 0;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();

        System.out.println(Recursive(number));
    }
}
