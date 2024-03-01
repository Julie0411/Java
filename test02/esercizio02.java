package test02;

import java.util.Scanner;

/**
 * 10/10 pt.
 */

public class esercizio02 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Inserire il valore del primo cateto:");
        double cateto1 = keyboard.nextDouble();

        System.out.println("Inserire il valore del secondo cateto:");
        double cateto2 = keyboard.nextDouble();

        double teoremaPitagora = Math.sqrt(Math.pow(cateto1, 2)
                + Math.pow(cateto2, 2));
        System.out.println("L'ipotenusa vale: " + teoremaPitagora + " cm.");
        
    }

}
