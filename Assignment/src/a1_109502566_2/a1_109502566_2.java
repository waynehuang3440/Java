package a1_109502566_2;
import java.util.Scanner;
import java.lang.Math;

public class a1_109502566_2 {
    public static void main( String [] args ) {
        Scanner scn = new Scanner( System.in );
        int input = scn.nextInt();
        int ud, td, hd, n;
        double nar;
        ud = input % 10;
        td = ( ( input % 100 ) - ud ) / 10;
        hd = ( input - ( 10 * td ) - ud ) / 100;
        n = 0;
        while ( true ) {
            nar = Math.pow( td, n ) + Math.pow( ud, n ) + Math.pow( hd, n );
            if (input == nar) {
                System.out.println(input + " is a narcissistic number.");
                break;
            } else if (input < nar) {
                System.out.println(input + " is not a narcissistic number.");
                break;
            }
            n++;
        }
    }
}
