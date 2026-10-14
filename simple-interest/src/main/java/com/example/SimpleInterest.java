package com.example;

public class SimpleInterest {

    public double calculate(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        SimpleInterest obj = new SimpleInterest();

        double interest = obj.calculate(10000, 5, 2);

        System.out.println("Simple Interest = " + interest);
    }
}
