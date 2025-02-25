package lv.rvt;

public class Person {
    private String name;
    private String address;
    private int age;
    private int weight;
    private int height;

    public Person(String name, String Address) {
        this.name = name;
        // this.age = age;
        // this.weight = weight;
        // this.height = height;
        
    }

    public String getInfo() {
        return this.name + ", age " + this.address + " years";

    }

    public int getAge() {
        return this.age;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWeight() {
        return this.weight;
    }


    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }


    @Override
    public String toString() {
        return this.name + ", age " + this.address + " years";
    }
} 
