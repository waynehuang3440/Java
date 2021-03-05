//Assignment 2-1
package com.company;
import java.util.Scanner;

public class A2_1 {

    public static void main( String[] args ) {
        Scanner scn = new Scanner( System.in );
        int ran = ( int )( Math.random() * 100 ) + 1;
        int input, times = 0;
        while ( true ) {
            System.out.println( "輸入一數字：" );
            input = scn.nextInt();
            times++;
            if ( ran == input ) {
                break;
            }
            System.out.println( ( input > ran ) ? "比" + input + "還要小" : "比" + input + "還要大" );
        }
        System.out.println( "猜對了!總共猜了" + times + "次");
    }
}
