package com.simplilearn.demos;

public class Main {
    public static void main(String[] args) {
        //Create object of my thread
        /*MyThread t = new MyThread();
        t.start();*/

        MyRunnable target = new MyRunnable();
        Thread thread = new Thread(target);
        thread.start();
    }
}
