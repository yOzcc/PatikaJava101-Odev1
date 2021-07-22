import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ucgenin 1.kenarının uzunluğunu giriniz: ");
        int kenar1 = input.nextInt();

        System.out.println("Ucgenin 2.kenarının uzunluğunu giriniz: ");
        int kenar2 = input.nextInt();

        double hipotenus = (Math.sqrt((kenar1*kenar1)+(kenar2*kenar2)));
        System.out.println("Hipotenüs : "+ hipotenus);


        double uc = (kenar1+kenar2+hipotenus)/2;
        double ucgenCevresi = 2*uc;
        double alan;
        alan = Math.sqrt(uc * (uc- kenar1)* (uc- kenar2) * (uc- hipotenus));
        System.out.println("Üçgenin alanı: "+ alan);

    }
}
