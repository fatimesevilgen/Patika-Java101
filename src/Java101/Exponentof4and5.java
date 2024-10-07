package Java101;

import java.util.Scanner;

public class Exponentof4and5 {
    public static void main(String[] args) {

        // 4 ve 5'in kuvvetlerini ekrana yazdıran program
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int a = scanner.nextInt();

        for(int i = 1; i <= a; i++){
            if((i % 4 == 0) && (i % 5 == 0)){
                System.out.println(i);
            }
        }
    }
}
