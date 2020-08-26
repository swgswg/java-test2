package com.primenumber;


/**
 * 素数
 */
public class PrimeNumber
{
    public static boolean isPrime(int x)
    {
        boolean is = true;
        if( x == 1 || x % 2 ==0 && x != 2 ) {
            is = false;
        } else {
            for( int i =3; i< Math.sqrt(x); i+=2) {
                if( x % i == 0) {
                    is = false;
                    break;
                }
            }
        }
        return is;
    }

}
