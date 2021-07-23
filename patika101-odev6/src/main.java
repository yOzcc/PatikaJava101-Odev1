import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int r = 0;
        double pi= 3.14;


        Scanner input= new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double a;

        System.out.println("Dairenin merkez açısının ölçüsünü giriniz: ");
        a = input.nextDouble();



        System.out.println("Dairenin alanı: "+ alan);
        System.out.println("Dairenin çevresi: "+ cevre);

        double alan2= (pi * (r * r) * a)/360;
        System.out.println("Yarıçapı "+ r +", merkez açısının ölçüsü "+ a +" olan daire diliminin alanı: "+ alan2);


        }
    }

