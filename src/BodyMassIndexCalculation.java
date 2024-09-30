import java.util.Scanner;

public class BodyMassIndexCalculation {
    public static void main(String[] args) {

        //Vücut Kitle İndexi Hesaplama
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz(metre cinsinden): ");
        double length = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        double bodyMassIndex = kilo / (length * length);

        System.out.print("Vücut Kitle İndeksiniz: " + bodyMassIndex);
    }
}
