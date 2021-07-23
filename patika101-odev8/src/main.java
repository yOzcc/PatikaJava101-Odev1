import java.util.Scanner;
public class main {
    public static void main (String [] args){

    double armut= 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican= 5.00;
    double pazarUrunleri [] = {armut,elma,domates,muz,patlican};

    Scanner input= new Scanner(System.in);

        System.out.println("Kaç kilo armut aldiniz? ");
        double armutKilo = input.nextDouble();
        double armutFiyat = armutKilo*armut;

        System.out.println("Kaç kilo elma aldiniz? ");
        double elmaKilo = input.nextDouble();
        double elmaFiyat = elmaKilo*elma;

        System.out.println("Kaç kilo domates aldiniz? ");
        double domatesKilo = input.nextDouble();
        double domatesFiyat = domatesKilo*domates;

        System.out.println("Kaç kilo muz aldiniz? ");
        double muzKilo = input.nextDouble();
        double muzFiyat = muzKilo*muz;

        System.out.println("Kaç kilo patlican aldiniz? ");
        double patlicanKilo = input.nextDouble();
        double patlicanFiyat = patlicanKilo*patlican;

        double toplamFiyat = armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat;
        System.out.println("Ödemeniz gereken toplam tutar: "+ toplamFiyat);

}}