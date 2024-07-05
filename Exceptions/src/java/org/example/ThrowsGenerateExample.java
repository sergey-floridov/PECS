package org.example;

public class ThrowsGenerateExample {
    public static void throwOne() throws IllegalAccessException {
        System.out.println("Внутри throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {     // что будет, если не обернуть в try-catch?
            System.out.println("Выброс " + e);
        }
    }
}
