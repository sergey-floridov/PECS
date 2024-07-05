package org.example;

public class Test4 {
    public static void main(String[] args) {
        try {
            String str = "Hello Java world!!!";
            System.out.print(str.substring(0, 5));
            System.out.print(str.substring(10, 20));
            System.out.print("The end of try block");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print("In the catch block");
        }
        System.out.print("Done");
    }
}
