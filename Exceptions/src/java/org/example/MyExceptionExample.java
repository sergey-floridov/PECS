package org.example;

public class MyExceptionExample {
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехваченное исключение." + e);
        }
    }

    public static void compute(int a) throws MyException {
        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a, "Some message");
        }
        System.out.println("Нормальное завершение.");
    }
}


class MyException extends Exception {
    private int detail;

    public MyException(int detail, String message) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{"
                + "detail=" + detail
                + ", message=" + getMessage()
                + "} ";
    }
}