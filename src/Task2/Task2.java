//Ваша задача состоит в том, чтобы найти отсутствующее число среди всех чисел от 1 до n, кроме одного.
//        Ввод
//        Первая строка содержит целое число n.
//        Вторая строка содержит n-1 чисел. Каждое число уникально и находится в диапазоне от 1 до n (включительно).
//        Вывод
//        Выведите отсутствующее число.
//        Ограничения
//
//        2 <= n <= 2 * 10^5
//
//        Пример
//        Ввод:
//        5
//        2 3 1 5
//
//        Вывод:
//        4

package Task2;
import java.util.Arrays;

public class Task2 {
    static int n = 5;
    static int sum = 15;
    public static void main(String[] args) {
        System.out.println(sum - Arrays.stream(ArrayDigits).sum());
        };
        static int ArrayDigits[] = {2, 3, 1, 5};
    }

