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

        CalculatorDriver calculatorDriverObj = new CalculatorDriver();
        calculatorDriverObj.invokePerformMathOp(
                (a, b) ->  (a+b)
        );
        calculatorDriverObj.invokePerformMathOp(
                (a, b) ->  (a-b)
        );
        calculatorDriverObj.invokePerformMathOp(
                (a, b) ->  (a*b)
        );
        calculatorDriverObj.invokePerformMathOp(
                (a, b) ->  (a/b)
        );
        /*
          Here we not only pass the object "calculatorDriverObj".
          But, also the method behavior for the "invokePerformMathOp()".
          "WHAT"  the method should do is defined in the invoking class
           and the same (i.e., behaviour) is passed as a parameter.
           This is what called as Lambda expression
         */
    }
}

class CalculatorDriver{

    public void invokePerformMathOp(Calculator calculatorObj){
        System.out.println(" Result is : " + calculatorObj.performMathematicalOperation(1,2));
    }
}

/**
 * This Calculator is the functional interface
 * A functional interface
 *  * Shall have only one abstract method
 *
 *  Exceptions :
 *  1. Default method is allowed
 *
 */
interface Calculator{

    int performMathematicalOperation(int value1, int value2);
}
