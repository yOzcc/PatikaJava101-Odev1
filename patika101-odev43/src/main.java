import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = input.nextInt();

        int[] list = {56, 34, 1, 8, 101, -2, -33, 61, -34, 11};
        Arrays.sort(list);

        int min= 0;
        int max= 0;

        for (int i = 0 ; i < list.length ; i++) {
            if (list[i] < number) {
                min = list[i];
            }
            if (list[i] > number) {
                max = list[i];
                break;
            }
        }

        System.out.println("Minimum value : " + min);
        System.out.println("Maximum value : " + max);
    }
}
