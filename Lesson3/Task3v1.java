package Lesson3;

import java.util.ArrayList;
import java.util.Random;

public class Task3v1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            list.add(random.nextInt(20));
        }
        System.out.println(list);
        ArrayList<Integer> sortListOfOdd = sortOfOdd(list, numberOfOdd(list));
        System.out.println(sortListOfOdd);
    }   

    static Integer numberOfOdd(ArrayList<Integer> o) {
        int number = 0;
        for (Integer el : o) {
            if (el % 2 != 0) {
                number++;
            }
        }
        return number;
    }
    static ArrayList<Integer> sortOfOdd(ArrayList<Integer> arrList, Integer length) {
        ArrayList<Integer> sortList = new ArrayList<Integer>();
        int[] arr = new int[length];
        int index = 0;
        for (int i : arrList) {
            if (i % 2 != 0) {
                arr[index] = i;
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sortList.add(arr[i]);
        }
        return sortList;
    }
}

