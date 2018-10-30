package com.junit.demo;

public class CountCoinsApiImpl implements CountCoinsApi {
    public int getCountWays(int aim) {
        int[] coins = {1, 5, 10, 25};
        int changeWays = 0;
        if (aim == 0) {
            return changeWays;
        } else
            changeWays = changeCoinProcess(coins, 0, aim);
        return changeWays;
    }

    public int changeCoinProcess(int[] coins, int index, int aim) {
        int changeWays = 0;
        if (index == coins.length) {
            changeWays = aim == 0 ? 1 : 0;
        } else {
            for (int i = 0; coins[index] * i <= aim; i++) {
                changeWays += changeCoinProcess(coins, index + 1, aim - coins[index] * i);
            }
        }
        return changeWays;
    }
}
