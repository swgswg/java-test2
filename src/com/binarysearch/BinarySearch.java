package com.binarysearch;

import java.util.Arrays;

public class BinarySearch
{
    public static int binarysearch(int array[], int find)
    {
        int last = array.length - 1;
        // 获取中值
        int mid = last / 2;

        if(array[mid] > find){
            int[] minArr = Arrays.copyOfRange(array,0, mid + 1);
            System.out.println("minArr: " + Arrays.toString(minArr));
            return binarysearch(minArr ,find);
        }
        if (array[mid] < find) {
            int[] maxArr = Arrays.copyOfRange(array, mid + 1, last + 1);
            System.out.println("maxArr: " + Arrays.toString(maxArr));
            return binarysearch(maxArr, find);
        }
        return array[mid];
    }
}
