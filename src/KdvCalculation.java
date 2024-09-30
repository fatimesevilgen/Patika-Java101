import java.util.Scanner;

public class Patika2 {
    public static void main(String[] args) {

        //KDV tutarı hesaplayan program

        double kdvOrani = 0.18;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        double tutar = scanner.nextDouble();


        double kdvTutar = (kdvOrani * tutar) + tutar;

        System.out.println("KDV orani: " + kdvOrani);
        System.out.println("KDV'li Tutar : " + kdvTutar);
        System.out.println("KDV'siz Tutar : " + tutar);
    }
}
