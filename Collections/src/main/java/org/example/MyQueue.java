package org.example;

import java.util.LinkedList;

public class MyQueue {
    private final LinkedList<Object> list = new LinkedList<>();

//  FIFO или LIFO?
    public void put(Object o){
        list.addLast(o);
    }

    public Object get(){
        return list.removeFirst();
    }
}
