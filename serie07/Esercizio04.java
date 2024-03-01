package serie07;

import java.util.Scanner;

public class Esercizio04 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Inserire un numero");
        int n = keyboard.nextInt();

        if (n >= 100) {
            System.out.println(n + " è grandissimo");
        } else if (n >= 50) {
            System.out.println(n + " è grande");
        } else {
            System.out.println(n + " è piccolo");
        }

    }

}
