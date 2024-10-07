package Java101;

import java.util.Scanner;

public class CombinationCalculation {

    // Faktöriyel hesaplama fonksiyonu
    public static long faktoriyel(int sayi) {
        long sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    // Kombinasyon hesaplama fonksiyonu
    public static long kombinasyon(int n, int r) {
        if (r > n) {
            System.out.println("r, n'den büyük olamaz.");
            return 0;
        }
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = scanner.nextInt();

        long sonuc = kombinasyon(n, r);
        System.out.println("C(" + n + "," + r + ") = " + sonuc);
    }
}
