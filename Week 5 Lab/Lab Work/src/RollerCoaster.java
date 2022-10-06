import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RollerCoaster implements Comparable<RollerCoaster>{
    private String name;
    private String world;
    private int height;
    private int time;

    public RollerCoaster(String name, String world, int height, int time){
        this.name = name;
        this.world = world;
        this.height = height;
        this.time = time;
    }
    /*
    @Override
    public String toString(){
        return String.format("%s (%s): %d",this.name, this.world, this.time);
    }
    */
    /*
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.name);
        builder.append(" (");
        builder.append(this.world);
        builder.append("): ");
        builder.append(this.time);
        return builder.toString();
    }
    */
    @Override
    public String toString(){
        return new StringBuilder().append(this.name).append(" (").append(this.world).append("): ").append(this.time).toString();
    }
    public int compareTo(RollerCoaster o){
        if (this.time != o.time){
            return Integer.compare(this.time, o.time);
        }
        if (this.height != o.height){
            return -Integer.compare(this.height, o.height);
        }
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        RollerCoaster[] coasters = new RollerCoaster[n];
        for (int i = 0; i<n ; i++){
            String line = sc.nextLine();
            String[] tokens = line.split(";");
            RollerCoaster coaster = new RollerCoaster(
                tokens[0],
                tokens[1],
                Integer.parseInt(tokens[2]),
                Integer.parseInt(tokens[3])
            );
            coasters[i] = coaster;
        }
        Arrays.sort(coasters);
        for (RollerCoaster coaster : coasters){
            System.out.println(coaster);
        }
    }
}
