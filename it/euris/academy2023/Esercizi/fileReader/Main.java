package it.euris.academy2023.Esercizi.fileReader;
import java.io.File;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;


    public class Main {

        public static void main(String[] args) throws FileNotFoundException{

            File mioFile = new File("textinput.txt");

            if (!mioFile.exists()){//---------------------------------------------- file doesn't exist
                System.out.println("File not found.");
            }
            else {//---------------------------------------------------------------  file exists
                System.out.println("File exist.");

                Scanner lettore = new Scanner(mioFile);

                ArrayList<Integer> collezione = new ArrayList<Integer>();

                while (lettore.hasNextLine()) {
                    int riga = lettore.nextInt();
                    collezione.add(riga);
                }
                lettore.close();

                switch (collezione.size()){

                    case 0:
                        System.out.println("File empty.");
                        break;

                    case 1:
                        System.out.println(collezione.get(0));
                        break;

                    case 2:
                        System.out.println("Two numbers, and the sum is: " + (collezione.get(0)+collezione.get(1)));
                        break;

                    default:
                        System.out.println("More than two numbers, and the result is: " + prodotto(collezione));
                }
            }
        }

        public static int prodotto (ArrayList<Integer> x){

            int i = 0;
            int a = x.get(0);

            for (i = 1; i<= (x.size()-1); i++){
                a = a * x.get(i);
            }
            return a;
        }
    }
