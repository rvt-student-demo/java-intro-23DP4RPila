package lv.rvt;

public class Statistics {
    public double count;
    public double sum;

    public Statistics() {    

    }

    public void addNumber(double number) {
        count++;
        sum += number;
    }

    public double getCount() {
        return count;
    }  

    public double sum() {
        return sum;
    }

    public double average() {
        double average = 0;
        average = sum / count;
        return average;
    }
}
