package Java101;

import java.util.Scanner;

public class FindingHypotenuse {
    public static void main(String[] args) {

        //Dik Üçgende Hipotenüs Bulma
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz: ");
        int a = scanner.nextInt();

        System.out.print("2. Kenarı Giriniz: ");
        int b = scanner.nextInt();

        double c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs: " + c);
    }
}
