package com.simplilearn.client;

public class AddArguments3 {
    public static void main(String[] args) {
        int sum = 0;

        for (String element : args){
            try {
                sum += Integer.parseInt(element);
            }catch (NumberFormatException e){
                System.err.println("This is excluded: " + element);
            }
        }

        System.out.println("Sum: " + sum);
    }
}
