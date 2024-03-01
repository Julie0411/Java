package tutorial;

import java.util.Scanner;

public class IfElse_tutorial07 {

    public static void main(String[] args) {

        /*
        if = se 
        else = altrimenti
        if ed else servono per fare programmi che hanno più di 1 comportamento
        --> 2 o più comportamenti diversi
         */
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Inserisci la tua età");
        int eta = keyboard.nextInt();

        if (eta > 18 && eta < 25) {
            //&& = AND
            System.out.println("Accesso accordato.");
        } else {
            System.out.println("Accesso negato.");
        }

    }

}
