package com.example.simpledice;

public class Dice {

    private int sides;
    private int count;
    private int sum;

    private static int rolls[];

    public Dice(int s, int c) {
        sides = s;
        count = c;
        newRoll();
    }


    public void newRoll(){
        rolls = new int[count];

        for(int i = 0; i < count; i++){
            rolls[i] = (int) Math.floor((Math.random()*sides)+1);
        }

    }

    public int[] allRolls(){ return rolls; }

    public int sum(){
        sum = 0;

        for(int i = 0; i < rolls.length; i++){
            sum += rolls[i];
        }

        return sum;
    }

}


