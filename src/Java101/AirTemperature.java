package Java101;

import java.util.Scanner;

public class AirTemperature {
    public static void main(String[] args) {

        // Hava durumuna göre etkinlik önerme
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz : ");
        double temperature = scanner.nextDouble();

        if (temperature <= 5) {
            System.out.println("Kayak");
        }
        else if (temperature <= 15 && temperature > 5) {
            System.out.println("Sinema");
        }
        else if (temperature <= 25 && temperature > 10) {
            System.out.println("Piknik");
        }
        else if (temperature > 25) {
            System.out.println("Yüzme");
        }
    }
}
