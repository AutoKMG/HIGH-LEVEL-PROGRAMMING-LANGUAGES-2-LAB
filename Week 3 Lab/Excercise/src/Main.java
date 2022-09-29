public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("HU - 8481",1600,true);
        Car car2 = new Car("HU - 8481",1600,true);
        Car car3 = new Car("HU - 9854",1600,true);
        Car car4 = new Car("HU - 1465",1600,true);
        Truck truck1 = new Truck("HU - 8481",1600,true,9800);
        comparingObjects(car1,car2);
        comparingObjects(car1,car3);
        comparingObjects(car1,car4);
        comparingObjects(car2,car4);
        comparingObjects(car3,car4);
    }
    public static void comparingObjects(Car car1, Car car2){
        if (car1.compareTo(car2) == 0){
            System.out.println("They Are The Same!");
            System.out.print("Car Plate 1: " + car1.getPlate());
            System.out.print(" Car Plate 2: " + car2.getPlate() + "\n");
        } else if (car1.compareTo(car2) < 0) {
            System.out.println("Car 1 Plate Is Smaller Than Car 2 Plate");
            System.out.println("Car Plate 1: " + car1.getPlate());
            System.out.println("Car Plate 2: " + car2.getPlate());
        } else if (car1.compareTo(car2) > 0){
            System.out.println("Car 2 Plate is Smaller Than Car 1 Plate");
            System.out.println("Car Plate 2: " + car2.getPlate());
            System.out.println("Car Plate 1: " + car1.getPlate());
        }
    }
}
