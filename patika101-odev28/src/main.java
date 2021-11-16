import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int small = 0, big = 0, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("how many numbers to enter?");
        int number = input.nextInt();

        for(int i =1 ; i<=number ; i++){
            System.out.println("Please enter number : ");
            int count =input.nextInt();

            if(i==1){
                big = count;
                small = count;
            }
            else{
                if(count > big)
                    big = count;

                if(count < small)
                    small = count;
            }

        }

        System.out.println("smallest number : "+ small);
        System.out.println("biggest number : "+ big);

    }
}
