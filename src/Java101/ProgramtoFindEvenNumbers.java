package Java101;

import java.util.Scanner;

public class ProgramtoFindEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int sum = 0;
        int sayac = 0;

        for (int i = 0 ; i <= number ; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sayac++;
                sum += i;
            }
        }

        if (sayac > 0) {
            int average = sum / sayac;
            System.out.println("Ortalama: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}
