package Task3;//Вам дан массив из n целых чисел. Вы хотите изменить массив так, чтобы он увеличивался, т. е. каждый элемент был по крайней мере такого же размера, как предыдущий элемент.
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

public class Task3 {
    static int n = 5;
    static int f = 0;
    public static void main(String[] args) {
        int[] array = new int[n];
        array[0] = 3;
        array[1] = 2;
        array[2] = 5;
        array[3] = 1;
        array[4] = 7;

        for(int i = 0; i < n; i++) {
            if(array[i]<array[i-1]) {
               f = f + array[i-1]-array[i];
            }
        }
    }

}