package test02;

import java.util.Scanner;

/**
 * 20/20 pt.
 *
 * Brava!
 */

public class esercizio03 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Inserire il nome dell'evento:");
        String evento = keyboard.nextLine();
        
        System.out.println("Inserire la probabilità del singolo evento "
                + "(in decimale):");
        double probabilitàSingola = keyboard.nextDouble();
        
        System.out.println("Inserire quante volte far ripetere l'evento:");
        double ripetizioneEvento = keyboard.nextDouble();
        
        double probabilitàEventoRipetuto = Math.pow(probabilitàSingola, 
                ripetizioneEvento);
        
        System.out.println("Evento: " + evento + ".");
        System.out.println("Probabilità del singolo evento: " 
                + probabilitàSingola * 100 + "%" + ".");
        System.out.println("Probabilità che l'evento si ripeta " 
                + ripetizioneEvento + " volte: " 
                + probabilitàEventoRipetuto * 100 + "%" + ".");
        
    }

}
