package serie05;

public class esercizio02 {

    public static void main(String[] args) {
        
        double x = 6.0834;
        
        double polinomio = Math.pow(x, 4) + Math.pow(x, 3) 
                + Math.pow(x, 2) + Math.pow(x, 1);  
        System.out.println("il polinomio x^4+x^3+x^2+x^1 avente il valore "
                + "di x uguale a " + x + " sarebbe uguale a " 
                + polinomio + ".");
        
    }

}
