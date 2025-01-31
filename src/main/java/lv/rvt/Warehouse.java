package lv.rvt;

public class Warehouse {
    private double capacity; // Noliktavas ietilpība
    private double balance; // Cik aizņemtas vietas
    private double amount;
    public Warehouse(double capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        } else {
            this.capacity = capacity;
        }
    }
    
    public double getBalance(double balance) {
        return balance;
    }

    public double getCapacity(double capacity) {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public double takeFromWarehouse(double amount) {
        balance -= this.amount;
        return amount;
    }
    
    public String toString()  {
        return capacity;
    }
}
