import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Lego implements Comparable<Lego>{
    private String number;
    private String name;
    private String theme;
    private int pieces;

    public Lego(String number, String name, String theme, int pieces) {
        this.number = number;
        this.name = name;
        this.theme = theme;
        this.pieces = pieces;
    }
    @Override
    public int compareTo(Lego o){

        if(this.pieces!=o.pieces)
            return -Integer.compare(this.pieces,o.pieces);
        if(!Objects.equals(this.theme,o.theme))
            return this.theme.compareTo(o.theme);
        if(!Objects.equals(this.name,o.name))
            return this.name.compareTo(o.name);
        return this.number.compareTo(o.number);

    }
    @Override
    public String toString(){
        return String.format("%s (%s): %d - %s",this.name,this.number,this.pieces,this.theme);
    }

    public static void main(String[] args) {
        int n;
        int counter = 0;
        boolean manualSize;
        String line;
        Scanner sc = new Scanner(System.in);
        String onlyFirstLine = sc.nextLine();
        try {
            n = Integer.parseInt(onlyFirstLine);
            manualSize = true;
        } catch (NumberFormatException nfe){
             n = 20;
             manualSize = false;
        }
        Lego[] legos = new Lego[n];
        while (counter < n && sc.hasNextLine()){
            if(counter==0){
                if(manualSize){
                    line = sc.nextLine();
                }
                else {
                    line = onlyFirstLine;
                }
            } else {
                line = sc.nextLine();
            }
            if(Objects.equals(line,"END")){
                break;
            }
            String[] tokens = line.split(";");
            Lego lego = new Lego(
                    tokens[0],
                    tokens[1],
                    tokens[2],
                    Integer.parseInt(tokens[3]));
            legos[counter] = lego;
            counter++;
        }
        Arrays.sort(legos,0,counter);
        for(Lego lego:legos){
            if(lego!=null){
                System.out.println(lego);
            }
        }
    }
}
