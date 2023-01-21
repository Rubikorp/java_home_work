/*
 * Вычислить сумму чисел от 1 до n, 
 * вычислить n! произведение чисел от 1 до n
 */
public class Task1 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(factor(n));
        System.out.println(sum(n));
    }
    static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }
    static int sum(int n) {
        if(n==1) return 1;
        return n + sum(n-1);
    }
}
