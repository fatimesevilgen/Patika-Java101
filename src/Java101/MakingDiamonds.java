package Java101;

import java.util.Scanner;

public class MakingDiamonds {
    public static void main(String[] args) {

        // Yıldızlar ile elmas yapma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmas boyutunu giriniz: ");
        int size = scanner.nextInt();

        // Elmasın üst kısmı
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Elmasın alt kısmı
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
