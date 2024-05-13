//Учитывая строку, ваша задача состоит в том, чтобы переупорядочить свои буквы таким образом, чтобы она стала палиндром (то есть она читает те же форварды и назад).
//        Вход
//        Единственная входная линия имеет цепь длины n, состоящую из символов a - z.
//        Выход
//        Распечатайте палиндром, состоящий из символов оригинальной строки. Вы можете распечатать любое действительное решение. Если нет решений, распечатайте «Нет решения».
//        Ограничения
//
//        1 <= n <= 10^6
//
//        Пример
//        Вход:
//        AAAACACBA
//
//        Выход:
//        AACABACAA

package Task4;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Task4 {
    static String n = "AAAACACBA";

    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap();
        Character ch = null;
        for (int i = 0; i < n.length(); i++) {
            ch = n.charAt(i);
            if (hm.containsKey(ch)) {
                int oldValue = hm.get(ch);
                hm.put(ch, oldValue + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        System.out.println(hm);

        StringBuilder stbC = new StringBuilder(1);
        StringBuilder stbL = new StringBuilder();
        StringBuilder stbR = new StringBuilder();
        Map.Entry ent = hm.entrySet().stream()
                .filter(x -> {
                    return x.getValue() % 2 == 1;
                }).findFirst().orElse(null);
        Character chr = (Character) ent.getKey();
        stbC.append(chr);
        hm.put(chr, hm.get(chr) - 1);

        while (true) {
            for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
                Character c = entry.getKey();
                Integer value = entry.getValue();
                if (value >= 2) {
                    stbL.append(c);
                    stbR.append(c);
                    hm.put(c, hm.get(c) - 2);
                }
            }
            AtomicBoolean b = new AtomicBoolean(true);
            hm.values().forEach(n -> {
                if (n != 0) {
                    b.set(false);
                }
            });
            if (b.get() == true) {
                break;
            }
        }
        StringBuilder stbNew = stbR.reverse();
        String result = stbL.append(stbC).append(stbNew).toString();
        System.out.println(result);
    }
}






















