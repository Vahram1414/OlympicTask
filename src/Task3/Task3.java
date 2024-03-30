package Task3;
//Вам дан массив из n целых чисел. Вы хотите изменить массив так, чтобы он увеличивался, т. е. каждый элемент был по крайней мере такого же размера, как предыдущий элемент.
//        На каждом ходу вы можете увеличить значение любого элемента на единицу. Какое минимальное количество ходов необходимо?
//        Вход
//        Первая строка ввода содержит целое число n: размер массива.
//        Затем вторая строка содержит n целых чисел x_1,x_2,...,x_n: содержимое массива.
//        Выход
//        Выведите минимальное количество ходов.
//        Ограничения
//
//        1 <= n <= 2 * 10^5
//        1 <= x_i <= 10^9
//
//        Пример
//        Вход:
//        5
//        3 2 5 1 7
//
//        Выход:
//        5
import java.util.Random;
import java.util.Arrays;
public class Task3 {
    static int n = 7;
    static int f = 0;

    public static void main(String[] args) {
        int[] array = new int[n];

        Random r = new Random();
        for (int i = 1; i < n; i++) {
            System.out.println(array[i] = r.nextInt(n) + 1);

            if (array[i] < array[i-1]) {
                f = array[i-1] - array[i];
                array[i] = array[i] + f;
                System.out.println("Результат" +  + f);
            } else {
            System.out.println(array[i]);
            }
            System.out.println("Получаем");
            System.out.println(Arrays.toString(array));
        }
    }
}



