package serie10;

import java.util.Scanner;

public class Esercizio07 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Inserire il numero di * da posizionare "
                + "in orizontale");
        int x = keyboard.nextInt();

        System.out.println("Inserire il numero di * da posizionare "
                + "in orizontale");
        int y = keyboard.nextInt();

        for (int i = 0; i < y; i++) {

            for (int f = 0; f < x; f++) {
                System.out.print("*");
            }

            System.out.println();
            
        }

    }

}
