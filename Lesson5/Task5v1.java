package Lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
 * что 1 человек может иметь несколько телефонов.
 */
public class Task5v1 {
    public static void main(String[] args) {
        Scanner iScanner =  new Scanner(System.in);
        Map <String, ArrayList<String>> phoneBook = new HashMap<>();
        while (true) {
            System.out.printf("Введите имя(английскими буквами): ");
            String name = iScanner.next();
            ArrayList<String> numbers = new ArrayList<>();
            System.out.printf("Введите кол-во номеров у пользователя: ");
            int length = iScanner.nextInt();
            for (int i = 0; i < length; i++) {
                System.out.printf("Введите номер %d: ", i);
                String number = iScanner.next();
                numbers.add(number);
            }
            phoneBook.put(name, numbers);
            System.out.printf("Хотите продолжить да(0)/нет(1): ");
            int changeCompleted = iScanner.nextInt();
            if (changeCompleted == 1) {
                break;
            }
        }
        System.out.println(phoneBook);
    }
}

//-------------------------------------------
/*
 * Проблемы и улучшения
 * 
 * 1. Нельзя ввести имя на русском (пока нет времени разобраться и в задании это не зафиксировано)
 * 2. Номер можно ввести любой, абсолютно. Можно добавить валидацию в будущем
 */