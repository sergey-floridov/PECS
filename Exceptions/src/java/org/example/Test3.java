package org.example;

public class Test3 {
    static String str = "a";

    public static void main(String[] args) {
        new Test3().method1();
        System.out.println(str);
    }

    void method1() {
        try {
            method2();
        } catch (Exception e) {
            str += "c";
        }
    }

    void method2() throws Exception {
        method3(); str += "2";
        method3(); str += "2b";
    }

    void method3() throws Exception {
        throw new Exception();
    }
}
