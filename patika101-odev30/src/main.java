import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("how many steps will there be?");
        int step = input.nextByte();

        for(int i=0;i<step;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=2*step-1;k>=(2*i+1);k--){
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
