package com.demo.java;

public class ConditionalExample {


    public void simpleCondition(int value) {

        String description;
        GameType gameType;

        if (value < 10) {
            description = "Ten";
            gameType = GameType.GS75;
        } else if (value < 25) {
            description = "TwentyFive";
            gameType = GameType.CASINO;
        } else {
            description = "Morethan";
            gameType = GameType.SPORT;
        }
    }

}
