import java.util.Arrays;
import java.util.Objects;
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


   @Override
   public int compareTo(RollerCoaster o){
       if(this.time!=o.time)
           return Integer.compare(this.time,o.time);
       if(this.height!=o.height)
           return -Integer.compare(this.height,o.height);
       return this.name.compareTo(o.name);
   }

   @Override
    public String toString(){
       return String.format("%s (%s): %d",this.name,this.world,this.time);
   }

    public static void main(String[] args) {
        int n;
        int counter =0;
        boolean manualSize;
        String line;
        Scanner sc = new Scanner(System.in);
        String onlyFirstLine = sc.nextLine();
        try {
            n = Integer.parseInt(onlyFirstLine);
            manualSize=true;
        } catch(NumberFormatException nfe){
            n = 20;
            manualSize=false;
        }
        RollerCoaster[] coasters = new RollerCoaster[n];
        while(counter < n && sc.hasNextLine()){
            if(counter == 0){
                if(manualSize){
                    line = sc.nextLine();
                }
                else {
                    line = onlyFirstLine;
                }
            }
            else {
                line = sc.nextLine();
            }
            if (Objects.equals(line,"END")){
                break;
            }
            String[] tokens = line.split(";");
            RollerCoaster coaster = new RollerCoaster(
                    tokens[0],
                    tokens[1],
                    Integer.parseInt(tokens[2]),
                    Integer.parseInt(tokens[3]));
            coasters[counter] = coaster;
            counter++;
        }
        Arrays.sort(coasters,0,counter);
        for(RollerCoaster coaster: coasters){
            if(coaster != null){
                System.out.println(coaster);
            }
        }
    }
}