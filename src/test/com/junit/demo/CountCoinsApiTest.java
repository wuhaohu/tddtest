package com.junit.demo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CountCoinsApiTest {

    private CountCoinsApi sut = new CountCoinsApiImpl();

    @Test
    public void zero$_change_no_ways() {
        assertThat(sut.getCountWays(0)).isEqualTo(0);
    }

    @Test
    public void fifteen$_change_6_ways() {
        assertThat(sut.getCountWays(15)).isEqualTo(6);
    }

    @Test
    public void fifty$_change_49_ways() {
        assertThat(sut.getCountWays(50)).isEqualTo(49);
    }

    @Test
    public void hundred$_change_242_ways() {
        assertThat(sut.getCountWays(100)).isEqualTo(242);
    }
}