/*
 * Вычислить сумму чисел от 1 до n, 
 * вычислить n! произведение чисел от 1 до n
 */
public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factor(n));
    }
    static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }
}
