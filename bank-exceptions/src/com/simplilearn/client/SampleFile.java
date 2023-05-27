package com.simplilearn.client;

import java.io.FileNotFoundException;

public class SampleFile {
    public static void main(String[] args) {
        try {
            trouble();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void trouble() throws Exception{
        throw new Exception("Custom Exception");
    }
}