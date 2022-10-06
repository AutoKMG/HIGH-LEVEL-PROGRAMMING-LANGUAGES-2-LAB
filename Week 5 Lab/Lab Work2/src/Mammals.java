public class Mammals extends Animal{
    private int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override

    public String toString(){
        return super.toString() + String.format(" (number of legs: %d)",this.legs);
    }

    public Mammals(String name, double age, double weight, int legs) {
        super(name, age, weight);
        this.legs = legs;
    }
}
