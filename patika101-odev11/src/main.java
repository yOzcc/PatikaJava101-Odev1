import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int math,physics,turkish,chemistry,music;

        Scanner input = new Scanner(System.in);

        System.out.println("your math grade : ");
        math = input.nextInt();
        if(math<0 || math >100){
            System.out.println("please enter valid value");
            return;
        }

        System.out.println("your physics grade : ");
        physics = input.nextInt();
        if(physics<0 || physics >100){
            System.out.println("please enter valid value");
            return;
        }

        System.out.println("your turkish grade : ");
        turkish = input.nextInt();
        if(turkish<0 || turkish >100){
            System.out.println("please enter valid value");
            return;
        }

        System.out.println("your chemistry grade : ");
        chemistry = input.nextInt();
        if(chemistry<0 || chemistry >100){
            System.out.println("please enter valid value");
            return;
        }

        System.out.println("your music grade : ");
        music = input.nextInt();
        if(music<0 || music >100){
            System.out.println("please enter valid value");
            return;
        }

        double average = (math+physics+turkish+chemistry+music)/5;
        if (average<=55){
            System.out.println("you failed.");
        }
        else{
            System.out.println("congratulations.");
        }
        System.out.println("Your average is : " + average);
}}
