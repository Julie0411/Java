package serie09;

import java.util.Scanner;

public class Esercizio06and07and08 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double contoCliente = 100000.00;

        boolean flag = true;

        while (flag) {

            System.out.println("Saldo attuale: " + contoCliente + " CHF.");

            System.out.println("Inserire la cifra da prelevare o versare "
                    + "(aggiungere il segno + per versare e - per prelevare)");

            double soldi = keyboard.nextDouble();
            keyboard.nextLine();

            if (soldi < contoCliente) {
                contoCliente += soldi;
                System.out.println("Saldo attuale: " + contoCliente + " CHF.");
            } else {
                System.out.println("Saldo insufficiente. Operazione fallita.");
            }

            System.out.println("Desidera eseguire altre operazioni?");
            String risposta = keyboard.nextLine();

            if (risposta.equals("no")) {
                flag = false;
            }

        }

    }

}
