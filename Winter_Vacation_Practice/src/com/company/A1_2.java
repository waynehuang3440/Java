//Assignment 1-2
package com.company;
import java.util.Scanner;

public class A1_2 {

    public static void main( String[] args ) {
        Scanner scn = new Scanner( System.in );
        int x, y;
        x = scn.nextInt();
        y = scn.nextInt();
        int sum, sub, pro, pow = 1, floor, mod;
        float num1, num2, quo;
        sum = x + y;
        sub = x - y;
        pro = x * y;
        num1 = x;
        num2 = y;
        quo = num1 / num2;
        for ( int i = 0; i < y; i++ ) {
             pow = x * pow;
        }
        floor = x / y;
        mod = x % y;
        System.out.println( sum + "\n" + sub + "\n" + pro + "\n" + quo + "\n" + pow + "\n" + floor + "\n" + mod );
    }
}
