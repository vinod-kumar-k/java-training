package com.simplilearn.demos;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Name 1");
        names.add("Name 2");
        names.add("Name 1"); //Duplicate values will be ignored
        names.add("Name 3");
        names.add("Name 2");

        System.out.println(names);

        Optional<String> findName = names.stream().filter(s -> s.equals("Name 2")).findFirst();
        if(findName.isPresent()) {
            System.out.println("Name found: " + findName.get());
        }else{
            System.out.println("Could not find");
        }
    }
}
