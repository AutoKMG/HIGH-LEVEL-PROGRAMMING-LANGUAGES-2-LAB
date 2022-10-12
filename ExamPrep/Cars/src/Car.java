import java.util.Arrays;
import java.util.Objects;

public class Car implements Comparable<Car>{
    private String plate;
    private int power;
    private boolean automatic;

    public Car(String plate, int power, boolean automatic){
        this.plate = plate;
        this.power=power;
        this.automatic=automatic;
    }
    public String getPlate(){
        return this.plate;
    }
    public int getPower(){
        return this.power;
    }
    public boolean getAutomatic(){
        return this.automatic;
    }
    public void setPlate(String plate){
        this.plate = plate;
    }
    public void setPower(int power){
        this.power = power;
    }
    public void setAutomatic(boolean automatic){
        this.automatic = automatic;
    }
    @Override
    public String toString(){
        return String.format("Plate: %s. Power: %d. Automatic: %b.",this.plate,this.power,this.automatic);
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(this.plate,car.plate);
    }
    @Override
    public int compareTo(Car o){
        return this.plate.compareTo(o.plate);
    }
    public static void main(String[] args) {
        Car car1 = new Car("HU 895", 890, true);
        Car car2 = new Car("HU 947", 590, true);
        Car car3 = new Car("HU 258", 980, true);
        Car car4 = new Car("HU 347", 1200, true);
        Car[] cars = new Car[]{car1, car2, car3, car4};
        Arrays.sort(cars);
        for(Car car: cars){
            System.out.println(car);
        }
        Truck truck1 = new Truck("HU 417",2300,false,120);
        System.out.println(truck1);
    }
}