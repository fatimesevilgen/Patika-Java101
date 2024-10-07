package Java101;

import java.util.Scanner;

public class GroceryProgram {
    public static void main(String[] args) {

        //Manav Programı
        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç kilo armut? : ");
        double pearKg = scanner.nextDouble();

        System.out.print("Kaç kilo elma? : ");
        double appleKg = scanner.nextDouble();

        System.out.print("Kaç kilo domates? : ");
        double tomatoKg = scanner.nextDouble();

        System.out.print("Kaç kilo muz? : ");
        double bananaKg = scanner.nextDouble();

        System.out.print("Kaç kilo patlıcan? : ");
        double eggplantKg = scanner.nextDouble();

        double totalCost = (pearPrice * pearKg) +
                (applePrice * appleKg) +
                (tomatoPrice * tomatoKg) +
                (bananaPrice * bananaKg) +
                (eggplantPrice * eggplantKg);

        System.out.printf("Total Cost: %.2f TL", totalCost);
    }
}

