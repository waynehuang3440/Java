//Assignment 3-1
package com.company;
import java.util.Scanner;

public class A3_1 {
    public static void main( String[] args ) {
        Scanner scn = new Scanner( System.in );
        int x = scn.nextInt();
        for ( int i = 1; i < x+1; i++ ) {
            if ( findFactor( x, i ) ) {
                if ( findPrime( i ) ) {
                    System.out.println( i + " Y" );
                }
                else {
                    System.out.println( i + " N" );
                }
            }
        }
    }

    public static boolean findPrime( int n ) {
        if ( n == 1 ) {
            return false;
        }
        for ( int i = 2; i < n; i++ ) {
            if ( n % i == 0 ) {
                return false;
            }
        }
        return true;
    }

    public static boolean findFactor( int x, int n ) {
        if ( x % n == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}
