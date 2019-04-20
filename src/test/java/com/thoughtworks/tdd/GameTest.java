package com.thoughtworks.tdd;


import org.junit.Assert;
import org.junit.Test;


public class GameTest {

    @Test
    public void input_3_out_put_Fizz(){
        Game game = new Game();
        String result = game.IsThreeMultiple(6);
        Assert.assertEquals(result, "Fizz");
    }

    @Test
    public void input_5_out_put_Buzz(){
        Game game = new Game();
        String result = game.IsThreeMultiple(10);
        Assert.assertEquals(result, "Buzz");
    }

    @Test
    public void input_7_out_put_Whizz(){
        Game game = new Game();
        String result = game.IsThreeMultiple(10);
        Assert.assertEquals(result, "Buzz");
    }

    @Test
    public void input_not_Multiple_out_number(){
        Game game = new Game();
        String result = game.IsThreeMultiple(11);
        Assert.assertEquals(result, 11);
    }

}