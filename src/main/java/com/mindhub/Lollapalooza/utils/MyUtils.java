package com.mindhub.Lollapalooza.utils;

import java.util.Random;

public final class MyUtils {

    private MyUtils(){}

    public static int getNumberRandom(){
        Random random = new Random();
        return random.nextInt(999999);
    }

    /*public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }*/
}
