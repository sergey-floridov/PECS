package org.example;

import java.util.HashMap;
import java.util.Map;

public class UniqueChars {

    private Map<Character, Integer> map = new HashMap<>();
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    public void calculate() {
//        for (char c : text.toCharArray()) {
//            if (Character.isLetter(c)) {
//                if () {
//
//                } else {
//
//                }
//            }
//        }
//    }

    @Override
    public String toString() {
        String result =
                "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result += "char: " + entry.getKey() +
                    "; count: " + entry.getValue() + "\n";
        }
        return result;
    }
}
