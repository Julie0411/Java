package serie05;

public class esercizio01 {

    public static void main(String[] args) {

        double cat1 = 3.7;
        double cat2 = 9.2;
        
        double quadr1 = Math.pow(cat1, 2);
        double quadr2 = Math.pow(cat2, 2);
        double ipo = Math.sqrt(quadr1 + quadr2);
        ipo = Math.round(ipo);
        
        /*
        Per semplificare il codice si può anche scrivere:
        double ipo = Math.sqrt( 
            Math.pow(cat1, 2.0) + Math.pow(cat2, 2.0) 
        );
        */

        System.out.println("Avendo un cateto 1 uguale a " + cat1
                + " cm e un cateto 2 uguale a " + cat2
                + " cm l'ipotenusa sarà uguale a " + ipo + " cm.");

    }

}
