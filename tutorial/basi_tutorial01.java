package tutorial;


public class basi_tutorial01 {

    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 6;
        int c = a + b;
        
        System.out.println(c);
        
        int anni = 16;
        String fraseInizio = "Luca ha ";
        String fraseFine = " anni.";
        /*
        String fraseCompleta = fraseInizio + anni + fraseFine;
        si può fare ma non conviene perché è un passaggio in più e perciò 
        rende il codice più lungo e complesso inutilmente.
        */
        
        System.out.println(fraseInizio + anni + fraseFine); 
            
    }
    
}
