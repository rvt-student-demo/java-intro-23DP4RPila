package lv.rvt; // atrašanās vieta

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Give speed:");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int result = Integer.valueOf(input);

        if (result > 120) {
            System.out.println("Speeding ticket!");
        }

    }
}