/*
 * Реализовать простой калькулятор (операции + - / * )
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner =  new Scanner(System.in);
        System.out.printf("Введите а: ");
        double a = iScanner.nextDouble();
        System.out.printf("Введите b: ");
        double b = iScanner.nextDouble();
        System.out.println("Введите операцию: ");
        String oper = iScanner.next();
        System.out.printf("%.1f %s %.1f = %.1f", a, oper, b, calculate(a, b, oper));
        iScanner.close();
    }
    static double calculate(double a, double b, String operation) {
        double res = 0;
        switch (operation) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/": 
                res = a / b;
                break;
        }
        return res;
    }
}
