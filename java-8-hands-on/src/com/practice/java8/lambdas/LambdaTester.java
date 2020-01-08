package com.practice.java8.lambdas;

/**
 * @author Velmurugan Moorthy
 * 08.01.2020
 * This class is to practice the Lambda basics
 * Reference : Java course in Udemy by Dheeru Mundluru
 * Lecture URL :
 * https://www.udemy.com/course/java-in-depth-become-a-complete-java-engineer/learn/lecture/6242632#overview
 */

public class LambdaTester {
    public static void main(String[] args) {

        LambdaDriver lambdaDriver = new LambdaDriver();
        lambdaDriver.invokeFunctionalInterface(
                () -> System.out.println("Testing Lambda")
        );
        /*
          Here we not only pass the object "LambdaDrive".
          But, also the method behavior for the "doSomething()".
          "WHAT"  the method should do is defined in the invoking class
           and the same (i.e., behavious) is passed as a parameter.
           This is what called as Lambda expression
         */
    }
}

class LambdaDriver{

    public void invokeFunctionalInterface(FunctionalInterface functionalInterface){
        //functionalInterface.doSomething();
    }
}

interface FunctionalInterface{

    void doSomething();
}
