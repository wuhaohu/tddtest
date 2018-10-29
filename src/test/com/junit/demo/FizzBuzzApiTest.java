package com.junit.demo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzApiTest {

    private FizzBuzzApi sut = new FizzBuzzApiImpl();

    @Test
    public void 输入1返回1() {
        assertThat(sut.getFizzBuzz(1)).isEqualTo("1");
    }

    @Test
    public void 输入2返回2() {
        assertThat(sut.getFizzBuzz(2)).isEqualTo("2");
    }

    @Test
    public void 输入3返回Fizz() {
        assertThat(sut.getFizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    public void 输入5返回Buzz() {
        assertThat(sut.getFizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    public void 输入7返回Suzz() {
        assertThat(sut.getFizzBuzz(7)).isEqualTo("Suzz");
    }

    @Test
    public void 输入15返回FizzBuzz() {
        assertThat(sut.getFizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void 输入21返回FizzSuzz() {
        assertThat(sut.getFizzBuzz(21)).isEqualTo("FizzSuzz");
    }

    @Test
    public void 输入35返回BuzzSuzz() {
        assertThat(sut.getFizzBuzz(35)).isEqualTo("BuzzSuzz");
    }
}