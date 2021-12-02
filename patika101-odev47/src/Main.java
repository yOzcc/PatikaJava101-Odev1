import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static String isFind(int[] arr, int value){
        int counter = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == value){
                counter++;
            }
        }return "This number was repeated " + counter + " times.";
    }
    public static void main(String[] args) {

        int[] array = {1,2,2,3,4,5,11,12,35,35,47,78,104,104,104,201,203};

        Scanner value = new Scanner(System.in);
        System.out.println("Enter the number to search for in the array : ");
        int input = value.nextInt();

        System.out.println(Arrays.toString(array));
        System.out.println(isFind(array,input));

}
}
