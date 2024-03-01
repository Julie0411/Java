package serie05;

import java.util.Scanner;

public class esercizio03 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Questo programma serve a calcolare le radici "
                + "quadrate approssimate all'intero.");
        System.out.println("Inserire un numero: ");
        
        double numeroUtente = keyboard.nextDouble();
        
        double risultato = Math.round( 
                Math.sqrt(numeroUtente)
        );
        
        System.out.println(risultato);
        
    }

}
