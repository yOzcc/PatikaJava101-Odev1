import java.util.Scanner;

public class main {
    public  static  void  main ( String [] args ) {

    Scanner input = new Scanner(System.in);

    System.out.println("Lütfen boyunuzu m cinsinden giriniz: ");
    double height = input.nextFloat();

    System.out.println("Lütfen kilonuzu kg cinsinden giriniz: ");
    double weight = input.nextFloat();

    double vki = weight / (height * height);

    System.out.println("Vücut kitle endeksiniz: "+ vki);
    }}
