package com.discount;

import java.util.HashMap;
import java.util.Map;

public class ThreeLevel extends AbstractDiscount
{
    public static Map<Integer, Double> specs = new HashMap<Integer, Double>(){
        {
            put(100, 0.7);
            put(200, 0.65);
            put(300, 0.6);
        }
    };

    public ThreeLevel (double price)
    {
        super(price, specs);
    }
}
