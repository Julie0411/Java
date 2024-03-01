package tutorial;

public class Teoria {

    public static void main(String[] args) {
        
        int a = 1; //crea variabile intera
        int b = 7;
        a = 3; //modifica variabile intera
        int c = a + b;
        
        String valore = "Il valore della somma di a e b è "; //creo una stringa 
        
        System.out.println(valore + c + "."); //stampo a video una concatenazione di variabili
        
        int eta = 5;
        
        String fraseEtaInizio = "Il mio cane ha ";
        String fraseEtaFine = " anni.";
        
        String fraseEtaCompleta = fraseEtaInizio + eta + fraseEtaFine; //concateno piu variabili   
        
        System.out.println(fraseEtaCompleta);
        
        double nota1 = 4.9; //creo variabile decimale
        double nota2 = 5.25;
        double nota3 = 5.75;
        double media = (nota1 + nota2 + nota3) / 3;
        
        String fraseMedia = "La media delle mie note scolastiche è: ";
        
        System.out.println(fraseMedia + media + ".");
        
        int f = 77; //creo variabile 
        f++; //aggiungo 1 al valore della vaiabile
        
        System.out.println("f ha valore: " + f + ".");
        
        int n = 39; //creo variabile 
        n--; //rimuovo 1 al valore della vaiabile
        
        System.out.println("n ha valore: " + n + ".");

    }

}
