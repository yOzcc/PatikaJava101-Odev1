import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many elements will the set have? ");
        int cluster = input.nextInt();
        int total = 1;
        int totalSubset = 1;
        int number = 1;

        for(int i=1; i<=cluster; i++){
            total = total * i;
        }
        System.out.println("factorial of the number you entered : "+ total);

        System.out.println("How many elements will the subset have?");
        int subset = input.nextInt();

        for (int j=1; j<= subset; j++){
            totalSubset = totalSubset * j;
        }

        for (int k=1; k<=cluster-subset; k++){
            number = number * k;
        }

        System.out.println("combination("+cluster+","+subset+") = "+ (total/(totalSubset * number)));

    }
}
