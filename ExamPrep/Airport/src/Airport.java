import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Airport implements Comparable<Airport>{
    public String airport;
    public String city;
    public int runways;
    public int transferTime;
    public Airport(String airport, String city, int runways, int transferTime){
        this.airport = airport;
        this.city = city;
        this.runways = runways;
        this.transferTime = transferTime;
    }
    @Override
    public String toString(){
        return String.format("%s (%s): %d",this.airport,this.city,this.transferTime);
    }
    @Override
    public int compareTo(Airport o){
        if(this.runways!=o.runways){
            return -Integer.compare(this.runways,o.runways);
        }
        if(this.transferTime!=o.transferTime){
            return -Integer.compare(this.transferTime,o.transferTime);
        }
        return this.airport.compareTo(o.airport);
    }

    public static void main(String[] args) {
        Airport[] airports = new Airport[20];
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if (Objects.equals(line,"END")){
                break;
            }
            String[] tokens = line.split(";");
            Airport newAirport = new Airport(
                    tokens[0],
                    tokens[1],
                    Integer.parseInt(tokens[2]),
                    Integer.parseInt(tokens[3])
            );
            airports[counter] = newAirport;
            counter++;
        }
        Arrays.sort(airports,0,counter);
        for (int i = 0; i<counter;i++){
            System.out.println(airports[i]);
        }
    }
}