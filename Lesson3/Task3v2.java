package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3v2 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
        Random random = new Random();
        list.add(random.nextInt(10));
    }
    System.out.println(list);

    Collections.sort(list);
    System.out.println(list);

    int min = list.get(0);
    int max = list.get(list.size() - 1);
    int medium = list.get(list.size() / 2);
    
    System.out.printf("max = %d; medium = %d; min = %d", max, medium, min);

  }  
}
