package com.example.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testmultiDollar(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
    }

    @Test
    void testEqualityDollar(){
        assertEquals(Money.dollar(5),  Money.dollar(5));
        assertNotEquals(Money.dollar(5),Money.dollar(8));
        assertNotEquals(Money.dollar(5),new Franc(5));
    }
    @Test
    void testmultiFranc(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10),five.times(2));
        assertEquals(Money.franc(15),five.times(3));

    }

    @Test
    void testEqualityFranc(){
        assertEquals(Money.franc(5),  Money.franc(5));
        assertNotEquals(Money.franc(5),Money.franc(8));
    }
}
