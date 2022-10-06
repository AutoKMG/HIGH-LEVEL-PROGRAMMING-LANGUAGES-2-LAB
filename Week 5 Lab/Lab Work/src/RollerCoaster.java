import java.util.Scanner;

public class RollerCoaster {
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

    @Override
    public String toString(){
        return this.name + "(" + this.world + ")" + ": "+ this.time;
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
    }
}
