import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int num;
        int counter=0;
        int numbers=0;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter number :");
        num = input.nextInt();

        for(int i=0; i<=num; i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
                counter+=i;
                numbers++;
            }
        }
        System.out.println("Average of numbers :" + (counter/numbers));



    }
}

