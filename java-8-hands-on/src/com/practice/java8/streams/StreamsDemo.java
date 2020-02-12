package com.practice.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Velmurugan Moorthy
 */
public class StreamsDemo {

    public static void main(String[] args){

        List<String> studentNames = new ArrayList<>();

        studentNames.addAll(Arrays.asList("Velu","Waylu","Velmurugan", "", " ", "Moorthy"));

        System.out.println("\nInitial student list : ");
        studentNames.forEach(System.out::println);

        invokeStreamOperations(studentNames);

    }

    private static void invokeStreamOperations(List<String> studentNames) {
        List<String> filteredStudentNames = filterEmptyStrings(studentNames);
        printNonEmptyStrings(filteredStudentNames);
        printSortedNames(filteredStudentNames);
        prependStudentPrefix(filteredStudentNames);
    }

    /*
     map() - method is used process the given value and save the processed value
     to the current variable
     */
    private static void prependStudentPrefix(List<String> filteredStudentNames) {
        System.out.println("After prepeding a word to student name : ");
        filteredStudentNames.stream().map(studentName -> ("Student Name : "+studentName))
        .forEach(System.out::println);
    }

    private static void printSortedNames(List<String> filteredStudentNames) {
        System.out.println("\nStudent list after Sorting: ");
        filteredStudentNames.stream().sorted().forEach(System.out::println);
    }

    private static void printNonEmptyStrings(List<String> studentNames) {
        System.out.println("\nStudent list after filtering: ");
        studentNames.stream().forEach(System.out::println);
    }

    private static List<String> filterEmptyStrings(List<String> studentNames) {
        return studentNames.stream()
                .filter(tempString -> !tempString.isEmpty())
                .collect(Collectors.toList());
    }
}
