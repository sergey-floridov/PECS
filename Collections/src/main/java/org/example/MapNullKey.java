package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapNullKey {
    public static void main(String[] args) {
        Map map = new HashMap<Integer, String>();
        map.put(null,  "test"); // момент истины ... ошибки нет!
        System.out.println(map.size()); // вывод: 1
        System.out.println(map.get(null)); // вывод: test
        map.put(0,  "0");
        System.out.println(map.size()); // вывод: 2
        Map map2 = new HashMap();
        map2.put(null,  null);
        Object o = map2.get(null);// результат null говорит нам, что значения по этому ключу нет, значит и самого ключа тоже нет
        boolean b = map2.containsKey(null);// результат true: а ключ на самом деле есть, и значение тоже есть
        System.out.println(o);
        System.out.println(b);

        System.out.println("-----------------------------------------------");

        Set set = new HashSet<String>();
        set.add(null);
        set.forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        set.add("Второй элемент");
        set.forEach(System.out::println);
    }

}
