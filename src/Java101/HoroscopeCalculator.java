package Java101;

import java.util.Scanner;

public class HoroscopeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ay ve gün bilgisi al
        System.out.print("Doğduğunuz ayı girin (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Doğduğunuz günü girin: ");
        int day = scanner.nextInt();

        String burc = "";

        if (month == 1) { // Ocak
            if (day <= 19) {
                burc = "Oğlak";
            } else {
                burc = "Kova";
            }
        } else if (month == 2) { // Şubat
            if (day <= 18) {
                burc = "Kova";
            } else {
                burc = "Balık";
            }
        } else if (month == 3) { // Mart
            if (day <= 20) {
                burc = "Balık";
            } else {
                burc = "Koç";
            }
        } else if (month == 4) { // Nisan
            if (day <= 19) {
                burc = "Koç";
            } else {
                burc = "Boğa";
            }
        } else if (month == 5) { // Mayıs
            if (day <= 20) {
                burc = "Boğa";
            } else {
                burc = "İkizler";
            }
        } else if (month == 6) { // Haziran
            if (day <= 20) {
                burc = "İkizler";
            } else {
                burc = "Yengeç";
            }
        } else if (month == 7) { // Temmuz
            if (day <= 22) {
                burc = "Yengeç";
            } else {
                burc = "Aslan";
            }
        } else if (month == 8) { // Ağustos
            if (day <= 22) {
                burc = "Aslan";
            } else {
                burc = "Başak";
            }
        } else if (month == 9) { // Eylül
            if (day <= 22) {
                burc = "Başak";
            } else {
                burc = "Terazi";
            }
        } else if (month == 10) { // Ekim
            if (day <= 22) {
                burc = "Terazi";
            } else {
                burc = "Akrep";
            }
        } else if (month == 11) { // Kasım
            if (day <= 21) {
                burc = "Akrep";
            } else {
                burc = "Yay";
            }
        } else if (month == 12) { // Aralık
            if (day <= 21) {
                burc = "Yay";
            } else {
                burc = "Oğlak";
            }
        } else {
            System.out.println("Geçersiz ay girdiniz!");
            return;
        }
        System.out.println("Burcunuz: " + burc);
    }
}
