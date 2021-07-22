import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Alinacak fiyati giriniz :");
        float alinacakFiyat = input.nextFloat();

        if(alinacakFiyat>=0 && alinacakFiyat<1000){
            System.out.println("KDV'siz fiyat: "+ alinacakFiyat);
            float kdvliFiyat = (alinacakFiyat+((alinacakFiyat*18)/100));
            System.out.println("KDV'li fiyat: "+kdvliFiyat);
            System.out.println("KDV tutarı :"+ (kdvliFiyat-alinacakFiyat));
        }
        else if(alinacakFiyat>=1000){
            System.out.println("KDV'siz fiyat: "+ alinacakFiyat);
            float kdvliFiyat = (alinacakFiyat+((alinacakFiyat*8)/100));
            System.out.println("KDV'li fiyat: "+kdvliFiyat);
            System.out.println("KDV tutarı :"+ (kdvliFiyat-alinacakFiyat));
        }
        else {
            System.out.println("Lütfen 0'dan büyük, geçerli bir sayi giriniz.");
        }
    }
}
