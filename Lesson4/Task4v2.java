package Lesson4;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Создать очередь с помощью LinkedList и реализовать следующие методы:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
Вызвать полученные методы и убедиться в их работоспособности.
 */
public class Task4v2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Харьков");
        queue.offer("Киев");
        queue.offer("Кременчуг");
        queue.offer("Львов");
        System.out.println(queue);
        enqueue(queue);
        System.out.println(queue);
        dequeue(queue);
        System.out.println(queue);
        System.out.println(first(queue));
        System.out.println(queue);
        
    } 
    static Queue<String> enqueue (Queue<String> qq) {
        String firstElement = qq.remove();
        qq.offer(firstElement);
        
        return qq;
    }
    static Queue<String> dequeue (Queue<String> qq) {
        qq.poll();
        
        return qq;
    }
    static String first (Queue<String> qq) {
        String firstElement = qq.peek();
        
        return firstElement;
    }
}
