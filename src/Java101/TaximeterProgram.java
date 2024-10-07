package Java101;

import java.util.Scanner;

public class TaximeterProgram {
    public static void main(String[] args) {

        //Taksimetre Programı
        int startingFee = 10;
        double kmFee = 2.20;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç kilometre: ");
        double km = scanner.nextDouble();

        double totalFee = (km * kmFee) + startingFee;

        if (totalFee <= 20){
            System.out.print("Odenecek Ücret: " + "20 TL");
        }
        else{
            System.out.print("Odenecek Ücret: " + totalFee + "TL");
        }

    }
}