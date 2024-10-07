package Java101;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //Hesap Makinesi
        int num1, num2,sonuc;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        System.out.print("Enter operator: ");
        char operator = scanner.next().charAt(0) ;

        switch (operator){
            case '+':
                sonuc = num1 + num2;
                System.out.println(sonuc);
                break;
            case '-':
                sonuc = num1 - num2;
                System.out.println(sonuc);
                break;
            case '/':
                sonuc = num1 / num2;
                System.out.println(sonuc);
                break;
            case '*':
                sonuc = num1 * num2;
                System.out.println(sonuc);
                break;
                default:
                    System.out.println("Wrong operator");
        }
    }
}
