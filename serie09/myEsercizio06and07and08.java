package serie09;

import java.util.Scanner;

public class myEsercizio06and07and08 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double contoCliente = 100000.00;

        boolean flag = true;

        while (flag) {

            System.out.println("Saldo attuale: " + contoCliente + " CHF.");
            System.out.println("Desidera prelevare o versare?");
            String azione = keyboard.nextLine();

            if (azione.equals("prelevare")) {
                System.out.println("Inserisca l'importo da prelevare:");
                double prelievo = keyboard.nextDouble();
                keyboard.nextLine();
                contoCliente -= prelievo;

                if (contoCliente < 0) {
                    System.out.println("Prelevamento rifiutato.");
                    contoCliente += prelievo;
                } else {
                    System.out.println("Saldo attuale " + contoCliente
                            + " CHF.");
                }

            } else {
                System.out.println("Inserisca l'importo da versare "
                        + "(inserisca il segno più davanti alla cifra)");
                double versamento = keyboard.nextDouble();
                keyboard.nextLine();
                contoCliente = contoCliente + versamento;
                System.out.println("Saldo attuale " + contoCliente
                        + " CHF.");
            }

            System.out.println("Desidera eseguire altre operazioni?");
            String risposta = keyboard.nextLine();

            if (risposta.equals("no")) {
                flag = false;
            } else {
                flag = true;
            }

        }

    }

}