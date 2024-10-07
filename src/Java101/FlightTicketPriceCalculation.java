package Java101;

import java.util.Scanner;

public class FlightTicketPriceCalculation {
    public static void main(String[] args) {

        double kmPrice = 0.10;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        double km = scanner.nextDouble();

        if (km < 0) {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        System.out.print("Yaşınızı giriniz :");
        int age = scanner.nextInt();

        if (km < 0) {
            System.out.print("Hatalı Veri Girdiniz !");
        }

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int type = scanner.nextInt();

        if (!(type == 1 || type == 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        double price = km * kmPrice;
        if (age < 12) {
            price = price / 2;
        }
        else if (age > 12 && age < 24) {
            price = (price * 0.1) + price;
        }
        else if (age > 65 ){
            price = (price * 0.3) + price;
        }
        if (type == 2) {
            price = (price * 0.2) + price;
        }

        System.out.println("Toplam Tutar : " + price);
    }
}
