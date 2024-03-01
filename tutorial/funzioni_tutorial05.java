package tutorial;

public class funzioni_tutorial05 {

    public static void main(String[] args) {

        /*
        double n = 4.5;
        Math.round(n);
        System.out.println(n);
        
        Facendo così printerà comunque 4.5 perchè non abbiamo sovrascritto il 
        valore di n, cambiandone così il valore in modo che sia arrotondato.
        Si può scrivere così:
         */
        
        double n = 7.234567654;
        n = Math.round(n);
        System.out.println(n);
        //Math è la "libreria" dove troviamo le cose relative alla matematica

        //alcuni esempi:
        System.out.println(Math.round(8.534456789));
        System.out.println(Math.sqrt(81.0));
        System.out.println(Math.pow(9.0, 3.0));

    }

}
