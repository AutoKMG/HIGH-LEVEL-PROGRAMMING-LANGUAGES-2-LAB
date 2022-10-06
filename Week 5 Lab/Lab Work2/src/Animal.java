import java.util.Comparator;
import java.util.Objects;

public class Animal implements Comparable<Animal> {
    public String name;
    protected double age;
    private double weight;

    public Animal(String name, double age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
        // this.age = 0.0; the initial value for a double object is 0.0


    }

    public double getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.age, age) == 0 && Double.compare(animal.weight, weight) == 0 && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    @Override
    public int compareTo(Animal o){
        if(!this.name.equals(o.name)){
            return -this.name.compareTo(o.name);
        }
        if (this.age != o.age){
            return -Double.compare(this.age,o.age);
        }
        return Double.compare(this.weight,o.weight);
    }

    @Override
    public String toString() {
        return String.format("%s: %.1f ages, %.1f kg", this.name, this.age, this.weight);
    }

    public static void main(String[] args) {
        System.out.println(new Animal("elephant", 3.5, 870.0));
        System.out.println(new Mammals("elephant", 3.5, 870.0, 4));
    }
}
