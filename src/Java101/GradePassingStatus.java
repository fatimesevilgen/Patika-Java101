package Java101;

import java.util.Scanner;

public class GradePassingStatus {
    public static void main(String[] args) {
         int turkce, matematik, fizik, kimya,biyoloji;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = scanner.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = scanner.nextInt();

        System.out.print("Biyoloji notunuzu giriniz: ");
        biyoloji = scanner.nextInt();

        double average = (matematik + turkce + fizik + kimya + biyoloji) / 5;

        if (average <= 60) {
            System.out.println("Sınıfta Kaldınız!");
        }
        else {
            System.out.println("Ortalamanız: " + average);
        }
    }
}
