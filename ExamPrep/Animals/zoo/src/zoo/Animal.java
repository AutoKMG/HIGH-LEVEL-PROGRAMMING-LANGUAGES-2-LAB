package zoo;

import java.util.Comparator;
import java.util.Objects;

public class Animal implements Comparable<Animal> {
    public String species;
    protected double age;
    private double weight;

    public Animal(String species, double age, double weight) {
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String species, double weight) {
        this.species = species;
        this.weight = weight;
        this.age=0.0;
    }

    public double getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString(){
        return String.format("%s: %.1f ages, %.1f kg",this.species,this.age,this.weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.age, age) == 0 && Double.compare(animal.weight, weight) == 0 && Objects.equals(species, animal.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, age, weight);
    }
    @Override
    public int compareTo(Animal o){
        if(!Objects.equals(this.species,o.species)){
            return -this.species.compareTo(o.species);
        }
        if(this.age!=o.age){
            return -Double.compare(this.age,o.age);
        }
        return Double.compare(this.weight,o.weight);
    }
}
