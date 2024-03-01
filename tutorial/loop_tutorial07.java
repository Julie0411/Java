package tutorial;

public class loop_tutorial07 {

    public static void main(String[] args) {

        /*
        while (true){
            System.out.println("Hello world!");
        }  
        while true stampa all'infinito
        
        int i = 0; //i sta per interazione (giro)
        while (i < 10) {
            System.out.println("Hello world!");
            System.out.println(i++);
        }

        in questo caso abbiamo aggiunto la condizione i minore di 10 perciò 
        il programma si ripetera per 10 volte dopodicé si fermerà.
        */
        
        int i = 10; //i sta per interazione (giro)
        while (i > 0) {
            System.out.println("Hello world!");
            System.out.println(i);
            i--;
        }
        
    }

}
