import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array : ");
        int elements = input.nextByte();
        int first= 0, second= 1, sum = 0;

        for(int i=1 ; i<=elements ; i++){
            sum = first+second;
            System.out.println(first +" + " + second +" = " + sum);
            first = second;
            second = sum;
        }
    }
}
