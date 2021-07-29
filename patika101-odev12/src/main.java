import java.util.Scanner;

public class main {
    public static void main(String[] args){

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("What's the temperature?");
        heat = input.nextInt();

        if (heat<5 && heat>-25){
            System.out.println("You can go skiing.");
        }
        else if(heat>=5 && heat<15){
            System.out.println("You can go to the cinema.");
        }
        else if(heat>=15 && heat<25){
            System.out.println("You can go to the cinema.");
        }
        else if (heat>25 && heat<55){
            System.out.println("You can go swimming.");
        }
        else{
            System.out.println("Are you kidding?");
        }
    }
}
