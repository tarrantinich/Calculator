package com.company;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Calculator{

    public static Supplier<Calculator> instance = Calculator::new;

        BinaryOperator<Integer> plus = (x, y) -> x + y;
        BinaryOperator<Integer> minus = (x, y) -> x - y;
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        //BinaryOperator<Integer> devide = (x, y) -> x / y;      // вероятность деления на ноль
        BinaryOperator<Integer> devide = (x, y) -> {
            if (y != 0) { return x / y;}
            System.out.print("Деление на ноль. Введите новые параметры. ");
            return 0;
        };

        UnaryOperator<Integer> pow = x -> x * x;
        UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

        Consumer<Integer> println = System.out::println;

}
