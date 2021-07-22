import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int turkceNot = 0,matematikNot = 0,fizikNot = 0,kimyaNot = 0,tarihNot = 0,muzikNot = 0,donemSonuNot= 0, basariNot= 60;
        int Dersler []= {turkceNot,matematikNot,fizikNot,kimyaNot,tarihNot,muzikNot};

        System.out.println("Turkce notunuzu giriniz: ");
        turkceNot= input.nextInt();

        System.out.println("Matematik notunuzu giriniz: ");
        matematikNot= input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizikNot= input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimyaNot= input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarihNot= input.nextInt();

        System.out.println("Muzik notunuzu giriniz: ");
        muzikNot= input.nextInt();


        donemSonuNot= ((turkceNot+matematikNot+fizikNot+kimyaNot+tarihNot+muzikNot)/Dersler.length);

        System.out.println("Donem sonu ortalamanız: "+ donemSonuNot);

        if(donemSonuNot>=basariNot){
            System.out.println("Sınıfı Geçtiniz.");
        }
        else{
            System.out.println("Sınıfta kaldınız");
        }



    }
}
