import java.util.Objects;

public class Car implements Comparable<Car>{
    private String plate;
    private int power;
    private boolean automatic;


   public Car(String plate, int power, boolean automatic){
       this.plate = plate;
       this.power = power;
       this.automatic = automatic;
   };
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
        return "Plate Number: " + this.plate + " Car Power: " + this.power + " Automatic: " + this.automatic;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o==null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(this.plate,car.plate);
    }
    @Override
    public int compareTo(Car o)
    {
        return this.plate.compareTo(o.plate);
    }
}

