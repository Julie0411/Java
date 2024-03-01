package tutorial;

import java.util.Scanner;

public class scanner_tutorial02 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //Scanner serve per ricevere un input esterno.
        System.out.println("Inserisci il tuo nome:");
        //Serve all'utente per capire ciò che deve fare.
        String nome = keyboard.nextLine();
        //Salva l'input dell'utente
        System.out.println("Benvenuto " + nome + "!");
        //Serve a dare un output al codice.

    }

}
