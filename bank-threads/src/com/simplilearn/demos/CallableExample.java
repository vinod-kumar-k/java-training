package com.simplilearn.demos;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) {
        Callable<String> task = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Hello World from Callable!!!";
            }
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(task);

        try{
            String result = future.get();
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            executor.shutdown();
        }
    }
}
