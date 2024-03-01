package serie08;

import java.util.Scanner;

public class Esercizio01 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Inserire unità di misura (mph/kmh)");
        String unita = keyboard.nextLine();

        System.out.println("Inserire la velocità:");
        double velocita = keyboard.nextDouble();

        if (unita.equals("mph")) {
            velocita = velocita * 1.60934;
            velocita = Math.round(velocita);
            unita = "kmh";
        } else {
            velocita = velocita / 1.60934;
            velocita = Math.round(velocita);
            unita = "mph";
        }

        System.out.println("La velocità è ugale a: " + velocita + unita);
    }

}
