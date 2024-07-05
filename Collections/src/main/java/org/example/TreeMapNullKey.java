package org.example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapNullKey {
    public static void main(String[] args) {
        Map map = new TreeMap<Integer, String>();
        map.put(null,  "null"); // ошибки нет!
//        System.out.println(map.size()); // вывод: 1
//        System.out.println(map.get(null)); // БАБАХ!! Exception in thread "main" java.lang.NullPointerException
    }
}
