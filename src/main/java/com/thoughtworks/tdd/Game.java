package com.thoughtworks.tdd;

import java.util.Objects;

public class Game {

    public String IsThreeMultiple(Integer number) {
        if(number%3 == 0){
            return "Fizz";
        }
        if(number%5 == 0){
            return "Buzz";
        }

        if(number%7 == 0){
            return "Whizz";
        }

        return number.toString();
    }
}
