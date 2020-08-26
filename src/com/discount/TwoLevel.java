package com.discount;

import java.util.HashMap;
import java.util.Map;

public class TwoLevel extends AbstractDiscount
{
    public static Map<Integer, Double> specs = new HashMap<Integer, Double>(){
        {
            put(100, 0.8);
            put(200, 0.75);
        }
    };

    public TwoLevel (double price)
    {
        super(price, specs);
    }
}
