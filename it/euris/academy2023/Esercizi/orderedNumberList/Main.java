package it.euris.academy2023.Esercizi.orderedNumberList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arrayInserito = new ArrayList<Integer>();

        System.out.println("How many numbers do you want to enter ?");
        int dimensione = input.nextInt();

        int valoreLetto;
        int i= 0;

        for (i = 0; i <= (dimensione - 1); i++){
            System.out.println("Input " + (i+1) + "^ Value");
            valoreLetto = input.nextInt();
            arrayInserito.add(valoreLetto);
        }
        VectorNum primoArray = new VectorNum(arrayInserito);

        String decisione = "Y";

        while (decisione.equalsIgnoreCase("Y")){

            System.out.println("What execute ?");
            System.out.println("(0) = INSERT Key");
            System.out.println("(1) = REMOVE Key");
            System.out.println("(2) = END");

            int scelta = input.nextInt();

            if (scelta == 2)
                continue;

            else {
                System.out.println("Input key to search:");
                int chiave = input.nextInt();

                if (chiave < 0){
                    System.out.println("Error: the key must be positive.");
                    System.exit(0);
                }

                switch (scelta){

                    //Insert
                    case 0:
                        System.out.println("Array: " + primoArray.vettore);
                        System.out.println("The key is in the index : " + primoArray.cercaValore(chiave));
                        System.out.println("Position: " + primoArray.getPosizione());
                        System.out.println("The index after insert:");
                        System.out.println(primoArray.inserisciValore(chiave));
                        break;

                    //Remove
                    case 1:
                        System.out.println("Array: " + primoArray.vettore);
                        System.out.println("The key is in the index: " + primoArray.cercaValore(chiave));
                        if (primoArray.cercaValore(chiave)){
                            System.out.println("Position: " + primoArray.getPosizione());
                            System.out.println("The index after remove:");
                            System.out.println(primoArray.rimuoviValore(chiave));
                        }
                        else
                            System.out.println("The key is not in the index.");
                        break;

                    //no valid input
                    default:
                        System.out.println("Error: please insert a valid number.");
                }
            }

            System.out.println("Do you want to do another ? (Y or N)");
            decisione = input.next();
        }
        input.close();
        System.out.println("END.");

    }
}
