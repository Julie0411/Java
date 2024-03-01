package serie04;

import java.util.Scanner;

public class Esercizio01 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Inserire una veloctà in mph:");
        double velocita = keyboard.nextDouble();
        double newVelocita = velocita * 1.609;
        
        System.out.println(velocita + " mph equivalgono a " 
                + newVelocita + " km/h.");
        
    }

}
