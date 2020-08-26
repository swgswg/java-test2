package com;

import com.binarysearch.BinarySearch;
import com.discount.NoLevel;
import com.discount.OneLevel;
import com.discount.ThreeLevel;
import com.discount.TwoLevel;
import com.primenumber.PrimeNumber;

import java.util.Arrays;
import java.util.Random;

/**
 * 0.写一段会员打折的程序代码，规则如下：
 *   1级会员消费满100打9折；
 *   2级会员消费满100打8折，满200打7.5折
 *   3级会员消费满100打7折，满200打6.5折，满300打6折；
 *   非会员消费满500打9折；
 * 1.写一段程序代码，利用Random类生成1个1000以内的随机数字，猜出这
 * 个数字，考虑尽可能的降低时间复杂度。生成随机数字代码如下:
 * Random random = new Random();
 * int num = random.nextInt(1000);
 * 2.写一段死循环程序代码，30s后跳出循环。
 * 3.判断101-200之间有多少个素数，并输出所有素数。
 * 素数：一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做素数
 * 4.输出9*9乘法表
 */
public class Main {

    public static void main(String[] args) {
        // 会员
        OneLevel oneLevel = new OneLevel(110);
        System.out.println(oneLevel.getDiscount());
        System.out.println(oneLevel.getDiscountedPrice());
        OneLevel oneLevel2 = new OneLevel(50);
        System.out.println(oneLevel2.getDiscount());
        System.out.println(oneLevel2.getDiscountedPrice());
        System.out.println("====================================");

        TwoLevel twoLevel = new TwoLevel(105);
        System.out.println(twoLevel.getDiscount());
        System.out.println(twoLevel.getDiscountedPrice());
        TwoLevel twoLevel2 = new TwoLevel(205);
        System.out.println(twoLevel2.getDiscount());
        System.out.println(twoLevel2.getDiscountedPrice());
        System.out.println("====================================");

        ThreeLevel threeLevel = new ThreeLevel(120);
        System.out.println(threeLevel.getDiscount());
        System.out.println(threeLevel.getDiscountedPrice());
        ThreeLevel threeLevel2 = new ThreeLevel(280);
        System.out.println(threeLevel2.getDiscount());
        System.out.println(threeLevel2.getDiscountedPrice());
        ThreeLevel threeLevel3 = new ThreeLevel(330);
        System.out.println(threeLevel3.getDiscount());
        System.out.println(threeLevel3.getDiscountedPrice());
        System.out.println("====================================");

        NoLevel noLevel = new NoLevel(600);
        System.out.println(noLevel.getDiscount());
        System.out.println(noLevel.getDiscountedPrice());
        System.out.println(noLevel.a);
        System.out.println("====================================");


        // 查找
        int[] sortArray = new int[1001];
        for(int i= 0; i <= 1000; ++i) {
            sortArray[i] = i;
        }
        Random random = new Random();
        int num = random.nextInt(1000);
        int findNum = BinarySearch.binarysearch(sortArray, num);
        System.out.println("查找的随机值: " + num);
        System.out.println("查找的随机值: " + findNum);
        System.out.println("====================================");


        // 素数
        int j = 0;
        for (int i = 101; i <= 200; ++i) {
            boolean isPrime = PrimeNumber.isPrime(i);
            if (isPrime) {
                ++j;
                System.out.println("素数: " + i);
            }
        }
        System.out.println("共有素数: " + j);
        System.out.println("====================================");


        // 9*9乘法表
        System.out.println("=============9*9乘法表==============");
        for (int i = 1; i <= 9; ++i) {
            for (int k = 1; k <= i; ++k) {
                System.out.print(i + "*" + k + "=" + (i * k) + " ");
            }
            System.out.println();
        }

        // 30s跳出循环
        boolean sec30 = true;
        //获取开始时间
        double pow30 = 30 * Math.pow(10, 9);
        long endTime = 0;
        long startTime = System.nanoTime();
        System.out.println("程序运行时间1： "+startTime+"ns");
        while (sec30) {
            //获取结束时间
            endTime = System.nanoTime();
            if(endTime - startTime >= pow30){
                sec30 = false;
            }
        }
        System.out.println("程序运行时间2： " + (endTime - startTime) + "ns");
    }

}
