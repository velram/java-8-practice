package com.practice.java8.streams;

import java.util.*;
import java.util.stream.Collectors;


public class StreamsTester {
    public static void main(String[] args) {

       Employee employee1 = new Employee("Amudhan");
       Employee employee2 = new Employee("Aaaravamudhan");
       Employee employee3 = new Employee("Aranganathan");
       Employee employee4 = new Employee("Basha");

       List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        /*
          Approach :
           * Filter names starting with a
           * Store those names alone in a list
         */

       List<Employee> filteredEmployees = employees.stream().filter(employee -> employee.name.startsWith("A") || employee.name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Printing all employee list ");
        employees.forEach(employee -> System.out.println(employee.name));

        /*
        System.out.println("\n Printing filtered employee list ");
        filteredEmployees.forEach(employee -> System.out.println(employee.name));
        */

        System.out.println("\n Printing filtered employee name list ");
        List<String> filteredEmployeeNames =  employees.stream().
                                              filter(employee -> employee.name.startsWith("A")
                                                      || employee.name.startsWith("A")).
                                              map(employee -> employee.name).
                                              collect(Collectors.toList());

        filteredEmployeeNames.forEach(employeeName -> System.out.println(employeeName));

    }
}


class Employee {

    public String name;

    public Employee(String pName){
        this.name = pName;
    }

}
