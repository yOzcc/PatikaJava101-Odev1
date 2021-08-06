import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int distance , age, tripNo;
        double totalPrice;
        totalPrice=0;
        


        Scanner input = new Scanner(System.in);

            System.out.println("enter the distance : (km)");
            distance = input.nextInt();
            if(distance<0){
                System.out.println("please enter a valid value.");
                return;
            }


            System.out.println("enter your age : ");
            age=input.nextInt();
            if(age<1){
                System.out.println("please enter a valid value.");
                return;
            }

        System.out.println("enter trip type : (1: One way - 2: Round trip)");
        tripNo = input.nextInt();
        if (tripNo<1||tripNo>2){
            System.out.println("please enter a valid value.");
            return;
        }


        if(age>0 && age<12){
            totalPrice=(distance*0.10)-(totalPrice*0.5);
        }
        if(age>=12 && age<=24){
            totalPrice=(distance*0.10)-(totalPrice*0.1);
        }
        if(age>65){
            totalPrice=(distance*0.10)-(totalPrice*0.3);
        }
        else {
            totalPrice=(distance*0.10);
        }

        System.out.println("total amount : "+ totalPrice + " TL");

        }
    }