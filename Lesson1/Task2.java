/*
 * Вывести все простые числа от 1 до 1000
 */

public class Task2 {
    public static void main(String[] args) {
        easyNumbers();
    }
    static void easyNumbers() {
        for(int i = 2; i < 1000; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
              if(i%j==0){
                ++count;
              }
            }
            if(count<2)
               System.out.println(i);
          }
    }
}
