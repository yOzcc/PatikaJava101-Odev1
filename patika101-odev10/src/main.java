import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        String userName, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username : ");
        userName = input.nextLine();

        System.out.println("Enter your password : ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("patika123")){
            System.out.println("Logging in...");
            System.out.println("You are logged in.");
        }
        else{
            System.out.println("Username or password is wrong");
            System.out.println("Do you want to change your password?");

            //after several security protocols.
            int number;
            System.out.println("1-Yes, 2-No");
            number = input.nextInt();

            switch (number){
                case 1:
                    System.out.println("Enter your new password: ");
                    newPassword = input.next();
                    if (newPassword.equals("patika123")){
                        System.out.println("Could not create password, please enter another password.");
                    }
                    else{
                        System.out.println("Your password has been successfully changed");
                    }
                    break;
                default:
                    System.out.println("You will be redirected to the login page.");
                    break;
            }

        }




    }
}