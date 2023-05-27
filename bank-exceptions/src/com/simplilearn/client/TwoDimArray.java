package com.simplilearn.client;

public class TwoDimArray {
    public static void main(String[] args) {
        int twoDim[][];
        //twoDim = new int[5][5]; //valid - Rectangular array
        //twoDim = new int[5][]; //valid

        twoDim = new int[][] {{1}, {2}, {3}, {4}, {5}};

        /*for (int i = 0; i < twoDim.length; i++){
            for (int j = 0; j < twoDim[i].length; j++){
                System.out.println(twoDim[i][j]);
            }
            System.out.println();
        }*/

        for (int[] array_element : twoDim){
            for (int element : array_element){
                System.out.println(element);
            }
            System.out.println();
        }
    }
}
