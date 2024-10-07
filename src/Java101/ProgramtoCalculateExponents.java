package Java101;

import java.util.Scanner;

public class ProgramtoCalculateExponents {
    public static void main(String[] args) {

        // Üslü sayı hesaplama
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = scanner.nextInt();

        System.out.print("Üs giriniz: ");
        int b = scanner.nextInt();

        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println(a + "^" + b + " = " + result);
    }
}
