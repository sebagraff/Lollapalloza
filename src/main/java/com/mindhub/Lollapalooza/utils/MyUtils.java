package com.mindhub.Lollapalooza.utils;

import java.util.Random;

public final class MyUtils {

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
