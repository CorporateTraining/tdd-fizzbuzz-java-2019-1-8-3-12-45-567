package com.thoughtworks.tdd;

public class Game {

    public String gameBegins(Integer number) {
        if (isThreeOrFiveAOrSevenMultiple(number)) {
            return replaceThreeOrFiveAOrSeven(number);
        }
        return number.toString();
    }

    private boolean isThreeOrFiveAOrSevenMultiple(Integer number) {
        return number % 3 == 0 || number % 5 == 0 || number % 7 == 0;
    }

    public String replaceThreeOrFiveAOrSeven(Integer number) {
        StringBuffer result = new StringBuffer();
        if (number % 3 == 0) {
            result.append("Fizz");
        }
        if (number % 5 == 0) {
            result.append("Buzz");
        }

        if (number % 7 == 0) {
            result.append("Whizz");
        }
        return String.valueOf(result);
    }

}
