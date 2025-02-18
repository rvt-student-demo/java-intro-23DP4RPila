package lv.rvt;

public class ProductWarehouse extends Warehouse {

    String wareHouseName;

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.wareHouseName = name;
    }

    public String getName() {
        return this.wareHouseName;
    }
    public void setName(String name) {
        this.wareHouseName = name;
    }

    @Override
    public String toString() {
        return getName() + ": ";
    }
}
