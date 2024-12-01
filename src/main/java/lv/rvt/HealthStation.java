package lv.rvt;

public class HealthStation {
    int weighings = 0;
    public int weight(Person person) {
        weighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
    person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return weighings;
    }
}