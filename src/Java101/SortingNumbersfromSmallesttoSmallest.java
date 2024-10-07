package Java101;

import java.util.Scanner;

public class SortingNumbersfromSmallesttoSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 3 sayı al
        System.out.print("Birinci sayıyı girin: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int num2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        int num3 = scanner.nextInt();


        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Küçükten büyüğe: " + num1 + " " + num2 + " " + num3);
            } else {
                System.out.println("Küçükten büyüğe: " + num1 + " " + num3 + " " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Küçükten büyüğe: " + num2 + " " + num1 + " " + num3);
            } else {
                System.out.println("Küçükten büyüğe: " + num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Küçükten büyüğe: " + num3 + " " + num1 + " " + num2);
            } else {
                System.out.println("Küçükten büyüğe: " + num3 + " " + num2 + " " + num1);
            }
        }
    }
}
