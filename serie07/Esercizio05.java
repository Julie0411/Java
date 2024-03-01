package serie07;

import java.util.Scanner;

public class Esercizio05 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean maggiorenne = true;

        System.out.println("Inserire il prezzo del biglietto:");

        double prezzo = keyboard.nextDouble();

        if (maggiorenne == true) {
            prezzo = (prezzo - (prezzo * 0.2));
        } else {
            
        }

        System.out.println("Il prezzo del biglietto è di " + prezzo
                + " franchi.");

    }

}
