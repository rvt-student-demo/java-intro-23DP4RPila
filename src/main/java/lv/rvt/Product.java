package lv.rvt;

public class Product {

// noteikt visus mainīgos
    String initialName;
    double initialPrice;
    int initialQuantity;

    Product(String initialName, double initialPrice, int initialQuantity) {
        this.initialName = initialName;
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
    }

    void showInfo() {
        System.out.println("Item info:");
        System.out.println();
        System.out.println("Name: " + initialName);
        System.out.println("Price: " + initialPrice);
        System.out.println("Quantity: " + initialQuantity);
    }
}
