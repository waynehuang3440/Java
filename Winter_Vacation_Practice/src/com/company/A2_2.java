//Assignment 2-2
package com.company;
import java.util.Scanner;
import java.lang.String;

public class A2_2 {
    public static void main( String[] args ) {
        Scanner scn = new Scanner( System.in );
        String input = scn.nextLine();
        int alp[];
        alp = new int[ 5 ];
        for ( int i = 0; i < 5; i++ ) {
            alp[ i ] = 0;
        }
        for ( int i = 0; i < input.length(); i++ ) {
            if ( input.charAt( i ) == 'a' ) {
                alp[ 0 ] += 1;
            }
            else if ( input.charAt( i ) == 'e' ) {
                alp[ 1 ] += 1;
            }
            else if ( input.charAt( i ) == 'i' ) {
                alp[ 2 ] += 1;
            }
            else if ( input.charAt( i ) == 'o' ) {
                alp[ 3 ] += 1;
            }
            else if ( input.charAt( i ) == 'u' ) {
                alp[ 4 ] += 1;
            }
        }
        System.out.println( "a:" + alp[ 0 ] + " e:" + alp[ 1 ] + " i:" + alp[ 2 ] + " o:" + alp[ 3 ] + " u:" + alp[ 4 ] );
    }
}
