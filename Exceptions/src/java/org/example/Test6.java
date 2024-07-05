package org.example;

public class Test6 {
    public static void main(String[] args) {
        try {
            System.out.print("In the try block ");
        } finally {
            System.out.print("In the finally block ");
        }
        System.out.print("Done");
    }

//    Что будет, если прописать catch (IOException e) {}?
}
