package com.junit.demo;

public class FizzBuzzApiImpl implements FizzBuzzApi {
    public String getFizzBuzz(int i) {
        String result = String.valueOf(i);
        if (i % 3 == 0) {
            result = "Fizz";
            if (i % 5 == 0) {
                result = "FizzBuzz";
                if (i % 7 == 0) {
                    result = "FizzBuzzSuzz";
                }
                return result;
            }
            if (i % 7 == 0) {
                result = "FizzSuzz";
            }
            return result;
        }
        if (i % 5 == 0) {
            result = "Buzz";
            if (i % 7 == 0) {
                result = "BuzzSuzz";
            }
            return result;
        }
        if (i % 7 == 0) {
            result = "Suzz";
            return result;
        }
        return result;
    }
}
