package test02;

import java.util.Scanner;

/**
 * 10/10 pt.
 */

public class esercizio01 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Inserire il prezzo del primo prodotto:");
        double prodotto1 = keyboard.nextDouble();
        
        System.out.println("Inserire il prezzo del secondo prodotto:");
        double prodotto2 = keyboard.nextDouble();
        
        System.out.println("Inserire il prezzo del terzo prodotto:");
        double prodotto3 = keyboard.nextDouble();
        
        double sommaProdotti = prodotto1 + prodotto2 + prodotto3;
        double mediaProdotti = sommaProdotti / 3;
        mediaProdotti = Math.round(mediaProdotti);
        
        System.out.println("Il prezzo medio è " + mediaProdotti + " CHF.");
        
    }

}
