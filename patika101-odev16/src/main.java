import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int birthYear;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your birth year");
        birthYear = input.nextInt();

        if(birthYear%12==0){
            System.out.println("your chinese zodiac sign is : Monkey");
        }
        if(birthYear%12==1){
            System.out.println("your chinese zodiac sign is : Rooster");
        }
        if(birthYear%12==2){
            System.out.println("your chinese zodiac sign is : Dog");
        }
        if(birthYear%12==3){
            System.out.println("your chinese zodiac sign is : Pig");
        }
        if(birthYear%12==4){
            System.out.println("your chinese zodiac sign is : Rat");
        }
        if(birthYear%12==5){
            System.out.println("your chinese zodiac sign is : Ox");
        }
        if(birthYear%12==6){
            System.out.println("your chinese zodiac sign is : Tiger");
        }
        if(birthYear%12==7){
            System.out.println("your chinese zodiac sign is : Rabbit");
        }
        if(birthYear%12==8){
            System.out.println("your chinese zodiac sign is : Dragon");
        }
        if(birthYear%12==9){
            System.out.println("your chinese zodiac sign is : Snake");
        }
        if(birthYear%12==10){
            System.out.println("your chinese zodiac sign is : Horse");
        }
        if(birthYear%12==11){
            System.out.println("your chinese zodiac sign is : Goat");
        }



    }
}