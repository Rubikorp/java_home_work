package Lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Task6v1 {
    public static void main(String[] args) {
       Notebook n1 = new Notebook();
       n1.id = 1;
       n1.madeIn = "China";
       n1.model = "Msi";
       n1.color = "черный";
       n1.hdd = 500;
       n1.ram = 16;
       n1.prise = 10000;

       Notebook n2 = new Notebook();
       n2.id = 2;
       n2.madeIn = "China";
       n2.model = "Asus";
       n2.color = "Серый";
       n2.hdd = 520;
       n2.ram = 8;
       n2.prise = 5000;

       Notebook n3 = new Notebook();
       n3.id = 3;
       n3.madeIn = "Germany";
       n3.model = "HP";
       n3.color = "Синий";
       n3.hdd = 1000;
       n3.ram = 16;
       n3.prise = 15000;

       HashSet<Notebook> catalog = new HashSet<Notebook>(Arrays.asList(n1, n2, n3));
       
       switch (userMenu()) {
            case (1):
                printCatalog(catalog);
                break;
            case (2):
                switch (filterMenu()) {
                    case (1):
                        switch (filterColorMenu()) {
                            case(1):
                                printFilterColorCatalog(catalog, "Синий");
                            break;
                            case(2):
                                printFilterColorCatalog(catalog, "черный");
                            break;
                            case(3):
                                printFilterColorCatalog(catalog, "Серый");
                            break;
                        }
                    break;
                }
                break;
            case (0):
                break;
       }
    }
    
    static void printCatalog(HashSet<Notebook> catalog) {
        for (Notebook notebook : catalog) {
            System.out.println(notebook.toString());
        }
    }

    static void printFilterColorCatalog(HashSet<Notebook> catalog, String color) {
        System.out.printf("Ноутбуки с цветом %s:", color );
        for (Notebook notebook : catalog) {
            if(color == notebook.color) {
                System.out.println();
                System.out.println(notebook.toString());
            }
        }
    }

    static int userMenu() {
        Scanner iScanner =  new Scanner(System.in);
        System.out.println("Добро пожаловать в каталог ноутбуков!\n Выберите действие:\n 1 - Печать всех товаров \n 2 - Поиск по каталогу \n 0 - Выход");
        int variator = iScanner.nextInt();
        
        return variator;
    }
    static int filterMenu() {
        Scanner iScanner =  new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую критерию поиска:\n 1 - цвет");
        int variator = iScanner.nextInt();
        
        return variator;
    }
    static int filterColorMenu() {
        Scanner iScanner =  new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую цвету:\n 1 - Синий \n 2 - Черный \n 3 - Серый");
        int variator = iScanner.nextInt();
        
        return variator;
    }
}
