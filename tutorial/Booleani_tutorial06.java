package tutorial;

public class Booleani_tutorial06 {

    public static void main(String[] args) {

        /*
        boolean è un tipo di variabile che ha un valore binario 
        perciò avrà valore uguale a true o false (IN MINUSCOLO)
         */
        //boolean var = false;
        //System.out.println(var);

        /*
        con i boolean si possono anche verificare delle condizioni
         */
        int x = 3;
        boolean condizione01 = (x > 3); //maggiore
        if (condizione01 == true) {
            System.out.println(x + " è maggiore di 3");
        } else {
            System.out.println(x + " è minore di 3");
        }
        
        boolean condizione02 = (x < 3); //minore
        if (condizione02 == true) {
            System.out.println(x + " è minore di 3");
        } else {
            System.out.println(x + " è maggiore di 3");
        }
        
        boolean condizione03 = (x >= 3); //maggiore o uguale
        if (condizione03 == true) {
            System.out.println(x + " è maggiore o uguale a 3");
        } else {
            System.out.println(x + " è maggiore di 3");
        }
        
        boolean condizione04 = (x <= 3); //minore o uguale
        if (condizione04 == true) {
            System.out.println(x + " è minore o ugale a 3");
        } else {
            System.out.println(x + " è maggiore di 3");
        }
        
        boolean condizione05 = (x == 3); //uguale
        if (condizione05 == true) {
            System.out.println(x + " è uguale a 3");
        } else {
            System.out.println(x + " è diverso da 3");
        }
        
        boolean condizione06 = (x != 4); //diverso
        if (condizione06 == true) {
            System.out.println(x + " è diverso da 3");
        } else {
            System.out.println(x + " è uguale a 3");
        }
        
    }

}
