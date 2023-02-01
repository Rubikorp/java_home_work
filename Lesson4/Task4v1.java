package Lesson4;
/*
 * Создать LinkedList целых чисел 
 * (заполнить случайными числами).
Реализуйте метод, который вернет 
“перевернутый” список.
 */

import java.util.LinkedList;
import java.util.Random;

public class Task4v1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Random random = new Random();
        int count = 0;
        while (count < 10) {
            ll.add(random.nextInt(10));
            count++;
        }
        System.out.println(ll);
        LinkedList<Integer> llReverse = revertList(ll);
        System.out.println(llReverse);
    }
    static LinkedList<Integer> revertList(LinkedList<Integer> arrList) {
        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        int count = arrList.size()-1;
        while (count >= 0) {
            ll2.add(arrList.get(count));
            count--;
        }
        return ll2;
    }
}
