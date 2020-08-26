package com.discount;

import java.util.HashMap;
import java.util.Map;

public class NoLevel extends AbstractDiscount
{
    public static Map<Integer, Double> specs = new HashMap<Integer, Double>(){
        {
            put(500, 0.9);
        }
    };

    public String a = "NoLevel";

    public NoLevel (double price)
    {
        super(price, specs);
    }
}
