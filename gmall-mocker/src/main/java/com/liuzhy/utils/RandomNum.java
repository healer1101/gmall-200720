package com.liuzhy.utils;

/**
 * @author zhiyin.liu
 * @create 2020-11-30 18:59
 */
import java.util.Random;

public class RandomNum {
    public static int getRandInt(int fromNum, int toNum) {
        return fromNum + new Random().nextInt(toNum - fromNum + 1);
    }
}

