package lv.rvt; // atrašanās vieta

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        double evenSum = 0;
        double oddSum = 0;
        Statistics stats = new Statistics();
        while (true) {
            int original = scanned.nextInt();

            if (original == -1) {
                break;
            } else { 
                stats.addNumber(original);
            if (original % 2 == 0) {
                evenSum += original;
            } else 
                oddSum += original;

            }
        }  
    System.out.println("Sum: " + stats.sum());
    System.out.println("Sum of even numbers: " + evenSum);
    System.out.println("Sum of odd numbers: " + oddSum);

    }
}
