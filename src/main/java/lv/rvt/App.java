package lv.rvt; // atrašanās vieta

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App 
{        public static void main(String[] args) {
   
    HealthStation childrensHospital = new HealthStation();

    Person ethan = new Person("Ethan", 1, 110, 7);
    Person peter = new Person("Peter", 33, 176, 85);

    System.out.println("weighings performed: " + childrensHospital.weighings());

    childrensHospital.weight(ethan);
    childrensHospital.weight(peter);

    System.out.println("weighings performed: " + childrensHospital.weighings());

    childrensHospital.weight(ethan);
    childrensHospital.weight(ethan);
    childrensHospital.weight(ethan);
    childrensHospital.weight(ethan);

    System.out.println("weighings performed: " + childrensHospital.weighings());
        
    }
}