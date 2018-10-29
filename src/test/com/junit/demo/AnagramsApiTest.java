package com.junit.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class AnagramsApiTest {
    private AnagramsApi sut = new AnagramsApiImpl();

    @Test
    public void 不传值返回空() {
        String word = "";
        List<String> result = new ArrayList<String>();
        result.add("");
        assertThat(sut.recurseArrange(word)).isEqualTo(result);
    }

    @Test
    public void 一位原样返回() {
        String word = "a";
        List<String> result = new ArrayList<String>();
        result.add(word);
        assertThat(sut.recurseArrange(word)).isEqualTo("a");
    }

    @Test
    public void 两位全排列() {
        String word = "ab";
        List<String> result = new ArrayList<String>();
        result.add(word);
        result.add("ba");
        assertThat(sut.recurseArrange(word)).isEqualTo(result);
    }

    @Test
    public void 三位全排列() {
        String word = "abc";
        assertThat(sut.recurseArrange(word).size()).isEqualTo(6);
    }

    @Test
    public void 四位全排列() {
        String word = "abcd";
        assertThat(sut.recurseArrange(word).size()).isEqualTo(24);
    }

}