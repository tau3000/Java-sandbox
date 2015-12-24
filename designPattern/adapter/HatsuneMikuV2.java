package adapter;

import java.lang.System;

public class HatsuneMikuV2{
    private int cost = 18000;
    public String getSong(){
        return "みくみくにしてやんよ";
    }

    public void sing(){
        System.out.println(getSong());
    }

    public int getCost(){
        return cost;
    }
}