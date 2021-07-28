package com.example.testing;

public class Franc extends Money{

    public Franc(int amount){
        this.amount=amount;
    }

    public Money times(int multi){
        return  new Franc(amount * multi);
    }

}
