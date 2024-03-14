package tutorial;

public class for_tutorial09 {

    public static void main(String[] args) {

        /*
        for (int i = 1; i <= 10; i++) {
           System.out.println(i);
        }
        
        Nella parentesi tonda del for ci sono sempre tre settori che sono 
        separate da ';'
        Il primo settore è la creazione dell'iteratore
        Il secondo settore è la condizione
        Il terzo settore è l'incrementatore
        Il for è più comodo rispetto al while, questo perché ha un codice 
        ottimizzato e più pulito.
         */
        for (int i = 0; i <= 70; i += 7) {
            System.out.println(i);
        }

        for (int i = 1000; i >= 0; i--) {
            System.out.println(i);
        }
        
    }

}
