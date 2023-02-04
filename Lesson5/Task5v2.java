package Lesson5;
/*
 * Пусть дан список сотрудников:
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Иван Савин
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.

Иван 4, ...
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task5v2 {
    public static void main(String[] args) {
        String[] listPeople = new String[] {
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Иван Савин",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };
        Map<String, Integer> db = new HashMap<>();
        DoubleNameInHash(db, listPeople);
       
        System.out.println(db);
    }

    static Map<String, Integer> DoubleNameInHash(Map<String, Integer> mapHash, String[] arr) {
        String[] listPeopleName = new String[arr.length];
        Set<String> setHash = new HashSet<>();
        int index = 0;

        for (String string : arr) {
            String[] splitString = string.split(" ");
            String name = splitString[0];
            if (setHash.add(name) == false){
                mapHash.put(name, 0);
            }
            listPeopleName[index] = name;
            index++;
        }

        countDoubleNameInHash(mapHash, listPeopleName);
        
        return mapHash;
    }

    static Map<String, Integer> countDoubleNameInHash(Map<String, Integer> mapHash, String[] arr) {
        for (String string : arr) {
            if (mapHash.containsKey(string) == true) {
                mapHash.put(string, mapHash.get(string)+1);
            }
        }
        
        return mapHash;
    }
}
