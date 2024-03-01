package serie04;

import java.util.Scanner;

public class Esercizio02 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Inserire il nome di una squadra:");
        String squadra = keyboard.nextLine();

        System.out.println("Inserire il numero di vittorie:");
        int vittorie = keyboard.nextInt();

        System.out.println("Inserire il numero di pareggi:");
        int pareggi = keyboard.nextInt();

        int punti = (vittorie * 3) + (pareggi * 1);

        System.out.println("Il " + squadra + " ha vinto " + vittorie
                + " partite, ne ha pareggiate " + pareggi
                + " e ha conquistato " + punti + " punti.");

    }

}
