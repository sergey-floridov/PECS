package org.example;

public class Test7 {
    static void test() {
        try {
            String x = null;
            System.out.print(x.toString() + " ");
        } finally {
            System.out.print("finally ");
        }
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception ex) {
            System.out.print("exception ");
        }
    }
}
