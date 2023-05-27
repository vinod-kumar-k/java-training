package com.simplilearn.demos;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");

        System.out.println(fruits);
        System.out.println(fruits.get(1));

        List<Map<String, Object>> students = new ArrayList<>();
        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "Name 1");
        student1.put("age", 25);

        students.add(student1);

        Map<String, Object> student2 = new HashMap<>();
        student2.put("name", "Name 2");
        student2.put("age", 30);

        students.add(student2);

        System.out.println(students);

        for (Map<String, Object> student : students){
            System.out.println("Name: " + student.get("name"));
            System.out.println("Age: " + student.get("age"));
        }
    }
}
