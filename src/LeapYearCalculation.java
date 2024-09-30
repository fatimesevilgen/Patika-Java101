import java.util.Scanner;

public class LeapYearCalculation {
    public static void main(String[] args) {

        // Artık Yıl Hesaplama
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " yılı artık yıldır");
        }
        else {
            System.out.println(year + " yılı artık yıl değildir");
        }
    }
}
