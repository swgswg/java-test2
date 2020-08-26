package com.discount;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 */
abstract public class AbstractDiscount
{
    public double price = 0;
    protected double discount = 1;
    public String a = "AbstractDiscount";

    public AbstractDiscount(double price, Map<Integer, Double>specs)
    {
        this.price = price;
        findDiscount(specs);
    }


    /**
     * 获取折扣
     * @return
     */
    protected void findDiscount(Map<Integer, Double> specs)
    {
        for(Map.Entry<Integer, Double> entry : specs.entrySet()){
            if(this.price > entry.getKey()){
                this.discount = entry.getValue();
            }
        }
    }


    /**
     * 获取折扣
     * @return
     */
    public double getDiscount()
    {
        return this.discount;
    }


    /**
     * 获取折扣后的价格
     * @return
     */
    public double getDiscountedPrice()
    {
        return (this.price * 100) * (this.discount * 100) / 10000;
    }

}
