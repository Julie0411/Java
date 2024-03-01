 package tutorial;

import java.util.Scanner;

public class Prove {

    public static void main(String[] args) {

        /*
        per usare lo scanner bisogna per prima cosa scrivere la funzione:
            Scanner keyboard = new Scanner(System.in);
        poi uscirà errore e allora bisogna andare sulla lampadina e selezionare
            Add import for java.util.Scanner 
        così aggiungiamo la classe e poi possiamo usare il nostro Scanner.
        poi per utilizzarle ci serve 
        keyboard.next"il tipo della variabile che vogliamo ricevere"();
        */
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Questo programma serve per fare delle somme; "
                + "inserire due cifre:");

        System.out.println("Inserire numero:");
        double numero1 = keyboard.nextDouble();
        keyboard.nextLine(); 
        
        /* 
        quando si aggiunge una keyboard.nextDouble o un keyboard.nextInt bisogna
        aggiungere anche un keyboard.nextString.
        */

        System.out.println("Inserire numero:");
        double numero2 = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Desideri aggiungere un'altro numero?");
        String risposta = keyboard.nextLine();
        
        
        if (risposta.equals("si")) {
            System.out.println("Inserire numero:");
            double numero3 = keyboard.nextDouble();
            double somma1 = numero1 + numero2 + numero3;
            System.out.println("Il risultato dell'addizione tra i numeri "
                    + "che hai scelto è " + somma1);
        } else {
            double somma = numero1 + numero2;
            System.out.println("Il risultato dell'addizione tra i numeri "
                    + "che hai scelto è " + somma);
        }

    }

}
