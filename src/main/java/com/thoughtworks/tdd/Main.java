package com.thoughtworks.tdd;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        for( int i = 0; i < 120; i++) {
            String result = game.gameBegins(i+1);
            System.out.println(result);
        }
    }
}
