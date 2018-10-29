package com.junit.demo;

public class FizzBuzzApiImpl implements FizzBuzzApi {
    public String getFizzBuzz(int i) {
        StringBuffer result = new StringBuffer();
        if (i % 3 == 0) {
            result.append("Fizz");
        }
        if (i % 5 == 0) {
            result.append("Buzz");
        }
        if (i % 7 == 0) {
            result.append("Suzz");
        }
        if (result.length() == 0) {
            result.append(i);
        }
        return result.toString();
    }
}
