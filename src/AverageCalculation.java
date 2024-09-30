import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] args) {

         //Not ortalaması hesaplama
        Scanner scanner = new Scanner (System.in);

        System.out.print("Matematik notunuz: ");
        int matematik = scanner.nextInt();

        System.out.print("Türkçe notunuz: ");
        int turkce  = scanner.nextInt();

        System.out.print("Fizik notunuz: ");
        int fizik = scanner.nextInt();

        System.out.print("Kimya notunuz: ");
        int kimya = scanner.nextInt();

        float ortalama;
        ortalama = (matematik + turkce + fizik + kimya) / 4 ;
        System.out.println("Ortalamanız: " + ortalama);
    }
}
