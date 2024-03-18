package Task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.BitSet;

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

//package Task2;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task2 {
    static int n = 7;

    public static void main(String[] args) {
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 3;
        array[2] = 2;
        array[3] = 5;
        int sum = 0;
        int arraySum = Arrays.stream(array).sum();
        Arrays.stream(array).sum();
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum-Arrays.stream(array).sum());
        }

}
