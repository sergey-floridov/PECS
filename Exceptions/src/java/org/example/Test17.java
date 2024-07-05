package org.example;

import java.io.IOException;

public class Test17 {
    public static void main(String[] args) {
        try (SomeResource2 r = new SomeResource2()) {
            throw new RuntimeException("RuntimeException");
        } catch (IOException e) {
            System.out.println("In the catch block");
        }
    }
}

class SomeResource2 implements java.io.Closeable {
    public void close() throws IOException {
        System.out.print("Closing resource ");
        throw new IOException("Close Exception");
    }
}
