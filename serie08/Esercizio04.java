package serie08;

import java.util.Scanner;

public class Esercizio04 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Inserire il numero di un mese da settemnre"
                + " a gennaio:");
        int mese = keyboard.nextInt();

        if (mese == 9) {
            System.out.println("Settembre");
        } else if (mese == 10) {
            System.out.println("Ottobre");
        } else if (mese == 11) {
            System.out.println("Novembre");
        } else if (mese == 12) {
            System.out.println("Dicembre");
        } else if (mese == 01) {
            System.out.println("Gennaio");
        } else {
            System.out.println("Mese non valido.");
        }

    }

}
