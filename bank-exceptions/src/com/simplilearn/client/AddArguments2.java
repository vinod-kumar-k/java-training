package com.simplilearn.client;

public class AddArguments2 {
    public static void main(String[] args) {
        try{
            int sum = 0;
            for (String element : args){
                sum += Integer.parseInt(element);
            }

            System.out.println("Sum: " + sum);
        }catch (NumberFormatException exception){
            System.err.println("Invalid number provided");
        }
    }
}
