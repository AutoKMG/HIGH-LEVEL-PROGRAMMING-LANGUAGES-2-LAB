package Drink;

import java.util.Objects;

public class Drinks implements Comparable<Drinks>{
    public String name;
    protected String unit;
    private int price;

    public Drinks(String name, String unit, int price) {
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public Drinks(String name, int price) {
        this.name = name;
        this.price = price;
        this.unit = "5 dl";
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override

    public String toString(){
        return String.format("%s, %s, %d Ft",this.name,this.unit,this.price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drinks drinks = (Drinks) o;
        return this.price == drinks.price && Objects.equals(this.name, drinks.name) && Objects.equals(this.unit, drinks.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, unit, price);
    }
    @Override
    public int compareTo(Drinks o){
        if(this.price!=o.price)
            return -Integer.compare(this.price,o.price);
        if(!Objects.equals(this.unit,o.unit))
            return this.unit.compareTo(o.unit);
        return this.name.compareTo(o.name);
    }
}