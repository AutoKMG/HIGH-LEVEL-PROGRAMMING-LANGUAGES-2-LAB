package zoo;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter=0;
        Animal[] listOfAnimals = new Animal[20];
        String line;
        while(sc.hasNextLine()){
            line = sc.nextLine();
            if (Objects.equals(line,"END")){
                break;
            }
            String[] tokens = line.split(";");
            if (tokens.length == 3){
                Animal animal = new Animal(
                        tokens[0],
                        Double.parseDouble(tokens[1]),
                        Double.parseDouble(tokens[2])
                );
                listOfAnimals[counter] = animal;
            }
            else {
                Mammal mammal = new Mammal(
                        tokens[0],
                        Double.parseDouble(tokens[1]),
                        Double.parseDouble(tokens[2]),
                        Integer.parseInt(tokens[3])
                );
                listOfAnimals[counter] = mammal;
            }
            counter++;
        }
        Arrays.sort(listOfAnimals,0,counter);
        for(int i = 0;i<counter;i++){
            System.out.println(listOfAnimals[i]);
        }
    }
}
