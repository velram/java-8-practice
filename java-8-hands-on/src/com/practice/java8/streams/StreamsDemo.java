package com.practice.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

    public static void main(String[] args){

        List<String> studentNames = new ArrayList<>();

        studentNames.addAll(Arrays.asList("Velu","Annan","Velmurugan"));

        studentNames.forEach(System.out::println);

        studentNames.stream()
                .filter(tempString -> !tempString.isEmpty())
                .forEach(System.out::println);

    }
}
