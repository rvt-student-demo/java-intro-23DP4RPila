package lv.rvt; // atrašanās vieta

public class App 
{
    public static void main( String[] args )
    {
        printStars(5);
        printStars(3);
        printStars(9);
    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number) { 
            System.out.print("*");
            i++;
            
        }
        System.out.println(""); 

    }

}
    