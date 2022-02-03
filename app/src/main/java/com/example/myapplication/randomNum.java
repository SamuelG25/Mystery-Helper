package com.example.myapplication;

import java.util.Random;


public class randomNum {

    public randomNum() {
        }

    //create and returns a random number to choose weapon
    public int getNum() {
        Random rand = new Random();
        int upperbound = 18;
        int int_random = rand.nextInt(upperbound);

        return int_random;
    }

}
