package lv.rvt; // atrašanās vieta

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Give points [0-100]:");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int result = Integer.valueOf(input);

        if (result < 0 ) {
            System.out.println("impossible!");
        } else if (result < 49) {
            System.out.println("failed");
        } else if (result < 59) {
            System.out.println("1");
        } else if (result < 69) {
            System.out.println("2");
        } else if (result < 79) {
            System.out.println("3");
        } else if (result < 89) {
            System.out.println("4");
        } else if (result < 100) {
            System.out.println("5");
        } else if (result > 100) {
            System.out.println("incredible!");
        }
    }
}