package serie07;

import java.util.Scanner;

public class Esercizio03 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Inserire un giorno del mese di ottobre:");
        int giorno = keyboard.nextInt();
        
        if (giorno <= 0 && giorno > 31) {
            System.out.println("Questa data non fa parte del mese di ottobre");
        } else {
            System.out.println("Questa data fa parte del mese di ottobre");
        }
        
    }

}
