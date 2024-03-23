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
    static int n = 5;
    static int sum = 0;

    public static void main(String[] args) {
        int[] array = new int[n];
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
        }
        int arraySum = n*(n+1)/2;
        System.out.println(arraySum);
        System.out.println(arraySum-Arrays.stream(array).sum());
        }




















//            int sum = 0;
//            int arraySum = Arrays.stream(array).sum();
//            for (int i = 1; i <= n; i++) {
//                sum = sum + i;
//            }
        }



