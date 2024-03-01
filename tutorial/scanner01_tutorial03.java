package tutorial;

import java.util.Scanner;

public class scanner01_tutorial03 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Inserici un valore per il raggio:");
        double raggio = keyboard.nextDouble();
        double piGreco = 3.1416;
        double circonferenza = 2 * raggio * piGreco;
        double area = raggio * raggio * piGreco;

        System.out.println("Un cerchio di raggio " + raggio
                + " cm ha una circonferenza di " + circonferenza
                + " cm e un'area di " + area + " cm^2.");

    }

}
