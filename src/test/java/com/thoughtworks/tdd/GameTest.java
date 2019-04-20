package com.thoughtworks.tdd;


import org.junit.Assert;
import org.junit.Test;


public class GameTest {

    @Test
    public void input_3_multiple_output_Fizz(){
        Game game = new Game();
        String result = game.replaceThreeOrFiveAOrSeven(6);
        Assert.assertEquals(result, "Fizz");
    }

    @Test
    public void input_5_multiple_output_Buzz(){
        Game game = new Game();
        String result = game.replaceThreeOrFiveAOrSeven(10);
        Assert.assertEquals(result, "Buzz");
    }

    @Test
    public void input_7_multiple_output_Whizz(){
        Game game = new Game();
        String result = game.replaceThreeOrFiveAOrSeven(14);
        Assert.assertEquals(result, "Whizz");
    }

    @Test
    public void input_not_Multiple_out_number(){
        Game game = new Game();
        String result = game.gameBegins(11);
        Assert.assertEquals(result, "11");
    }

    @Test
    public void input_3_and_5_output_Whizz(){
        Game game = new Game();
        String result = game.replaceThreeOrFiveAOrSeven(15);
        Assert.assertEquals(result, "FizzBuzz");
    }
    @Test
    public void input_5_and_7_output_Whizz(){
        Game game = new Game();
        String result = game.replaceThreeOrFiveAOrSeven(35);
        Assert.assertEquals(result, "BuzzWhizz");
    }
    @Test
    public void input_3_and_7_output_Whizz(){
        Game game = new Game();
        String result = game.replaceThreeOrFiveAOrSeven(21);
        Assert.assertEquals(result, "FizzWhizz");
    }

    @Test
    public void input_3_and_5_and_7_output_Whizz(){
        Game game = new Game();
        String result = game.replaceThreeOrFiveAOrSeven(105);
        Assert.assertEquals(result, "FizzBuzzWhizz");
    }

}
