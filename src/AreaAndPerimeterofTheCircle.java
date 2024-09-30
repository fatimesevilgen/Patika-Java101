import java.util.Scanner;

public class AreaAndPerimeterofTheCircle
    {
        public static void main(String[] args) {

            //Dairenin Alanını ve Çevresini hesaplama
            Scanner scanner = new Scanner(System.in);

            int r;
            double pi = 3.14;

            System.out.print("Yarıçapı giriniz: ");
            r = scanner.nextInt();

            double area = pi * r * r;
            double perimeter = 2 * pi * r;

            System.out.println("Dairenin alanı: " + area);
            System.out.println("Dairenin Çevresi: " + perimeter);
        }
    }
