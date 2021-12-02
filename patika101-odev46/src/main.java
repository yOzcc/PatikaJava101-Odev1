import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner values = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int len = values.nextInt();

        int[] array = new int[len];
        for (int i = 0 ; i < len ; i++){
            System.out.println("Enter the " + (i+1) + ". value : ");
            array[i] = values.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Sorting : " + Arrays.toString(array));
    }
}
