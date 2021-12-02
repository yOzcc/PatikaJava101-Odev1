import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5){
            System.out.println("please enter your guess : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Please keep your guess between 0 and 99.");
                if (isWrong){
                    right++;
                    System.out.println("You have entered too many incorrect entries. Remaining chance : " + (5-right));
                }
                else {
                    isWrong = true;
                    System.out.println("If you enter it incorrectly again, it will be deducted from your chances.");
                }
                continue;
            }
            if (selected == number){
                System.out.println("Congratulations! Right guess. The number you guessed : " + number);
                isWin = true;
                break;
            }
            else {
                System.out.println("You entered an incorrect number.");
                if (selected > number){
                    System.out.println("Your guess is greater than this number.");
                }
                else {
                    System.out.println("Your guess is less than this number.");
                }
                wrong[right++] = selected;
                System.out.println("Remaining chance : " + (5-right));
            }
        }
        if (!isWin){
            System.out.println("You lost.");
            if (!isWrong){
                System.out.println("Your predictions :" + Arrays.toString(wrong));
            }
        }
    }
}
