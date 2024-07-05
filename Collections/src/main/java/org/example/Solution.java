package org.example;

import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        String str1 = "Hello world!";
        String str2 = new String("Hello world!");

        str2.intern();
        boolean b = str1 == str2;
        System.out.println(b);
        Set<String> set = new HashSet<>();
        set.add(str1);
        set.add(str2);

        List<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);

        for (String str : list) {
            if (str == str1) {
                System.out.println("origin list");
            }
            if (str == str2) {
                System.out.println("copy list");
            }

        }


        for (String str : set) {
            if (str == str1) {
                System.out.println("origin set");
            }
            if (str == str2) {
                System.out.println("copy set");
            }
        }
//-------------------------------------------------------------------

        MyQueue myQueue = new MyQueue();
        myQueue.put("1");
        myQueue.put("2");
        myQueue.put("3");
        myQueue.put("4");
        myQueue.put("5");
        Object o1 = myQueue.get();
        Object o2 = myQueue.get();


//--------------------------------------------------------------------
        // Создаём список строк
        LinkedList<String> al = new LinkedList<>();
        // Добавляем элементы к списку строк
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Используем итератор или сплитератор, для отображения элементов al
        System.out.print("Начальное содержание al: ");
        Iterator<String> itr = al.iterator();
        Spliterator<String> spliter = al.spliterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

//        spliter.forEachRemaining(System.out::print);
////        Spliterator<String> secondSpliterator = spliter.trySplit();
////        if (secondSpliterator != null) {
////            secondSpliterator.forEachRemaining(System.out::println);
////        }
//        System.out.println();

        // Изменяем объекты и добавляем
        ListIterator<String> litr = al.listIterator();

        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
            litr.add("добавочка");
        }
        System.out.print("Изменённое содержание al: ");
        itr = al.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Теперь, отобразим список задом наперёд
        System.out.print("Изменённый список задом наперёд: ");

        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
//---------------------------------------------------------------------
        UniqueChars uniqueChars = new UniqueChars();
        uniqueChars.setText("jnbodsjfngvlrnfflkmsmfnknsfvkmnkn");
        uniqueChars.calculate();
        System.out.println(uniqueChars.toString());
    }

}
