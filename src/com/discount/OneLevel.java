package com.discount;


import java.util.HashMap;
import java.util.Map;

/**
 * 1级会员
 * 满100打9折
 */
public class OneLevel extends AbstractDiscount
{
    public static Map<Integer, Double> specs = new HashMap<Integer, Double>(){
        {
            put(100, 0.9);
        }
    };

    /**
     * @param price 价格
     */
    public OneLevel(double price)
    {
        super(price, specs);
    }
}
