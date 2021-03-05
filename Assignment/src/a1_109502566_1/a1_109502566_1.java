package a1_109502566_1;
import java.util.Scanner;

public class a1_109502566_1 {
    public static void main( String [] args) {
        Scanner scn = new Scanner( System.in );
        int scr1 = scn.nextInt(), scr2 = scn.nextInt(), scr3 = scn.nextInt();
        int ave;
        ave = ( scr1 + scr2 + scr3 ) / 3;
        System.out.println( ave );
        if ( ave >= 90 ) {
            System.out.println( "A" );
        }
        else if ( ave >= 80 ) {
            System.out.println( "B" );
        }
        else if ( ave >= 70 ) {
            System.out.println( "C" );
        }
        else if ( ave >= 60 ) {
            System.out.println( "D" );
        }
        else {
            System.out.println( "F" );
        }
    }
}
