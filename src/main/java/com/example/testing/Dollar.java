package com.example.testing;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dollar extends Money {


    public Dollar(int amount){
        this.amount=amount;
    }

    public Money times(int multi){
     return  new Dollar(amount * multi);
    }


}
