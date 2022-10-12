package Drink;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Drinks[] listOfDrinks = new Drinks[20];
        String line;
        int counter =0;
        while(sc.hasNextLine()){
            line = sc.nextLine();
            String[] tokens = line.split(";");
            if(tokens.length == 3){
                Drinks drink = new Drinks(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
                listOfDrinks[counter] = drink;
            } else {
                Alcoholic drink = new Alcoholic(tokens[0],tokens[1],Integer.parseInt(tokens[2]),Double.parseDouble(tokens[3]));
                listOfDrinks[counter] = drink;
            }
            counter++;
        }
        Arrays.sort(listOfDrinks,0,counter);
        for(int i= 0;i<counter;i++){
            System.out.println(listOfDrinks[i]);
        }
    }
}
