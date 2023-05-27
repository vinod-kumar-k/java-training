package com.simplilearn.demos;

public class TestBox {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setT(1);
        //integerBox.setT(2.0);
        Integer i = integerBox.getT();

        Box<String> stringBox = new Box<>();
        stringBox.setT("A");
        String s = stringBox.getT();

        System.out.println("Integer Box Value: " + i);
        System.out.println("String Box Value: " + s);
    }
}
