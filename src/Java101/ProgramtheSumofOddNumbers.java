package Java101;

import java.util.Scanner;

public class ProgramtheSumofOddNumbers {
    public static void main(String[] args) {

        //
        Scanner input = new Scanner(System.in);
        int number, sum = 0;

        do {
            System.out.print("Bir sayı girin (çıkmak için tek sayı girin): ");
            number = input.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }

        } while (number % 2 == 0);

        System.out.println("Çift ve 4'ün katı olan sayıların toplamı: " + sum);
    }
}

