import java.util.Scanner;
public class main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Gidilecek uzaklığı km cinsinden giriniz: ");
    float uzunluk = input.nextFloat();
    double fiyat;

    if(uzunluk<=4.55 && uzunluk>0){
        System.out.println("Ödenecek tutar : 20 TL'dir.");
        }
    else if(uzunluk>4.55){
        fiyat= 10+ (uzunluk*2.20);
        System.out.println("Ödenecek tutar : "+fiyat +" TL'dir.");
        }
    else{
        System.out.println("Lütfen 0 km'den fazla bir uzunluk giriniz.");
    }
}}
