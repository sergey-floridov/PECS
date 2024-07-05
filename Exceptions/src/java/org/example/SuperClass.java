package org.example;

import java.io.IOException;
import java.io.FileNotFoundException;

public class SuperClass {
    public SuperClass() throws IOException {
    }

    public void start() throws IOException {
    }
}


class SubClass extends SuperClass {
    public SubClass() throws IOException, ArithmeticException {
    }

    public void start() throws FileNotFoundException {
    }
}
