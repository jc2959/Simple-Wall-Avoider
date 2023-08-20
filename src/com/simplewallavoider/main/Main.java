package com.simplewallavoider.main;

import com.simplewallavoider.game.Environment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Environment().getBitmapEnvironment()).replace("],","],\n"));
    }
}