package it.euris.academy2023.Esercizi.Restaurant;

import java.util.Scanner;
import java.util.HashMap;

    //--------------------------------------------------------------------
//                            MAIN CLASS
//--------------------------------------------------------------------
    public class Main {

        // Main method
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            // Tables:
            Table tavolo1 = new Table(1,1);
            Table tavolo2 = new Table(2,2);
            Table tavolo3 = new Table(3,2);
            Table tavolo4 = new Table(4,8);
            Table tavolo5 = new Table(5,8);
            Table tavolo6 = new Table(6,8);

            // Menu as HashMap:
            HashMap<Integer, Integer> menu = new HashMap<Integer, Integer>();
            menu.put(1,5);
            menu.put(2,4);
            menu.put(3,1);
            menu.put(4,12);
            menu.put(5,1);
            menu.put(6,2);

            // Handle of request at the tables:
            while (true){
                System.out.println("Next Customers ?");
                System.out.println("(1): take a table");
                System.out.println("(2): Get an order");
                System.out.println("(3): The Bill");
                System.out.println("(0): Go Out.");

                int operazione = input.nextInt();

                if (operazione == 0)
                    break;

                //switch on previous request:
                switch (operazione){

                    // Take a table------------------------------------------
                    case 1:
                        System.out.println("Hoe many seats ?");
                        System.out.println("(1): One seat");
                        System.out.println("(2): Two seats");
                        System.out.println("(3): from two to eight seats");

                        int persone = input.nextInt();

                        // switch on number of seats
                        switch (persone){

                            // One seat
                            case 1:
                                if (tavolo1.libero){
                                    tavolo1.setOccupato();
                                    System.out.println("Table number One !");
                                }
                                else
                                    System.out.println("Sold Out.");
                                break;

                            // Two seats
                            case 2:
                                if (tavolo2.libero){
                                    tavolo2.setOccupato();
                                    System.out.println("Table number Two !");
                                }
                                else if (tavolo3.libero){
                                    tavolo3.setOccupato();
                                    System.out.println("Table number Three !");
                                }
                                else
                                    System.out.println("Sodl out.");

                                break;

                            // 3 to 8 seats
                            case 3:
                                if (tavolo4.libero){
                                    tavolo4.setOccupato();
                                    System.out.println("Table number Four !");
                                }
                                else if (tavolo5.libero){
                                    tavolo5.setOccupato();
                                    System.out.println("Table number Five !");
                                }
                                else if (tavolo6.libero){
                                    tavolo6.setOccupato();
                                    System.out.println("Table number Six !");
                                }
                                else
                                    System.out.println("Sold Out.");

                                break;

                            // more than eight seats
                            default:
                                System.out.println("Not available.");
                        }
                        break;

                    // Show Menu and take an order------------------------
                    case 2:
                        System.out.println("Tanle number:");
                        int num = input.nextInt();//table number to get order
                        System.out.println(".");

                        //switch on table to order:
                        switch (num){

                            case 1:
                                //loop to show menu on order
                                while (true){
                                    System.out.println("MENU:");
                                    System.out.println("(1) rise $5");
                                    System.out.println("(2) spaghetti  $4");
                                    System.out.println("(3) chicken $10");
                                    System.out.println("(4) salmon $12");
                                    System.out.println("(5) Water $1");
                                    System.out.println("(6) coca cola $2");
                                    System.out.println(".");

                                    System.out.println("Insert order (0) to exit:");
                                    int selezione = input.nextInt();

                                    if (selezione == 0)
                                        continue;
                                    else {
                                        tavolo1.setOrdineAttuale(selezione, menu.get(selezione));
                                    }
                                    System.out.println("It's enough ?");
                                    System.out.println("(1): Y; (2): N");
                                    int ancora = input.nextInt();
                                    if (ancora == 2)
                                        break;
                                }
                                break;

                            case 2:
                                while (true){
                                    System.out.println("MENU:");
                                    System.out.println("(1) rise $5");
                                    System.out.println("(2) spaghetti  $4");
                                    System.out.println("(3) chicken $10");
                                    System.out.println("(4) salmon $12");
                                    System.out.println("(5) Water $1");
                                    System.out.println("(6) coca cola $2");
                                    System.out.println(".");

                                    System.out.println("Insert order (0) to exit:");
                                    int selezione = input.nextInt();

                                    if (selezione == 0)
                                        continue;
                                    else {
                                        tavolo2.setOrdineAttuale(selezione, menu.get(selezione));
                                    }
                                    System.out.println("It's enough ?");
                                    System.out.println("(1): Y; (2): N");
                                    int ancora = input.nextInt();
                                    if (ancora == 2)
                                        break;
                                }

                                break;

                            case 3:
                                while (true){
                                    System.out.println("MENU:");
                                    System.out.println("(1) rise $5");
                                    System.out.println("(2) spaghetti  $4");
                                    System.out.println("(3) chicken $10");
                                    System.out.println("(4) salmon $12");
                                    System.out.println("(5) Water $1");
                                    System.out.println("(6) coca cola $2");
                                    System.out.println(".");

                                    System.out.println("Insert order (0) to exit:");
                                    int selezione = input.nextInt();

                                    if (selezione == 0)
                                        continue;
                                    else {
                                        tavolo3.setOrdineAttuale(selezione, menu.get(selezione));
                                    }
                                    System.out.println("It's enough ?");
                                    System.out.println("(1): Y; (2): N");
                                    int ancora = input.nextInt();
                                    if (ancora == 2)
                                        break;
                                }
                                break;

                            case 4:
                                while (true){
                                    System.out.println("MENU:");
                                    System.out.println("(1) rise $5");
                                    System.out.println("(2) spaghetti  $4");
                                    System.out.println("(3) chicken $10");
                                    System.out.println("(4) salmon $12");
                                    System.out.println("(5) Water $1");
                                    System.out.println("(6) coca cola $2");
                                    System.out.println(".");

                                    System.out.println("Insert order (0) to exit:");
                                    int selezione = input.nextInt();

                                    if (selezione == 0)
                                        continue;
                                    else {
                                        tavolo4.setOrdineAttuale(selezione, menu.get(selezione));
                                    }
                                    System.out.println("It's enough ?");
                                    System.out.println("(1): Y; (2): N");
                                    int ancora = input.nextInt();
                                    if (ancora == 2)
                                        break;
                                }
                                break;

                            case 5:
                                while (true){
                                    System.out.println("MENU:");
                                    System.out.println("(1) rise $5");
                                    System.out.println("(2) spaghetti  $4");
                                    System.out.println("(3) chicken $10");
                                    System.out.println("(4) salmon $12");
                                    System.out.println("(5) Water $1");
                                    System.out.println("(6) coca cola $2");
                                    System.out.println(".");

                                    System.out.println("Insert order (0) to exit:");
                                    int selezione = input.nextInt();

                                    if (selezione == 0)
                                        continue;
                                    else {
                                        tavolo5.setOrdineAttuale(selezione, menu.get(selezione));
                                    }
                                    System.out.println("It's enough ?");
                                    System.out.println("(1): Y; (2): N");
                                    int ancora = input.nextInt();
                                    if (ancora == 2)
                                        break;
                                }
                                break;

                            case 6:
                                while (true){
                                    System.out.println("MENU:");
                                    System.out.println("(1) rise $5");
                                    System.out.println("(2) spaghetti  $4");
                                    System.out.println("(3) chicken $10");
                                    System.out.println("(4) salmon $12");
                                    System.out.println("(5) Water $1");
                                    System.out.println("(6) coca cola $2");
                                    System.out.println(".");

                                    System.out.println("Insert order (0) to exit:");
                                    int selezione = input.nextInt();

                                    if (selezione == 0)
                                        continue;
                                    else {
                                        tavolo6.setOrdineAttuale(selezione, menu.get(selezione));
                                    }
                                    System.out.println("It's enough ?");
                                    System.out.println("(1): Y; (2): N");
                                    int ancora = input.nextInt();
                                    if (ancora == 2)
                                        break;
                                }
                                break;

                            default:
                                System.out.println("Invalid table");
                        }
                        break;

                    // Payment and table available---------------------------
                    case 3:
                        System.out.println("Insert number of table:");
                        int numero = input.nextInt();
                        System.out.println(".");

                        //switch on table ID
                        switch (numero){

                            case 1:
                                int conto1 = somma(tavolo1.ordineAttuale);
                                System.out.println("Amount to pay: $" + conto1);

                                tavolo1.ordineAttuale = null;
                                tavolo1.libero = true;
                                break;

                            case 2:
                                int conto2 = somma(tavolo2.ordineAttuale);
                                System.out.println("Amount to pay: $" + conto2);

                                tavolo2.ordineAttuale = null;
                                tavolo2.libero = true;
                                break;

                            case 3:
                                int conto3 = somma(tavolo3.ordineAttuale);
                                System.out.println("Amount to pay: $" + conto3);

                                tavolo3.ordineAttuale = null;
                                tavolo3.libero = true;
                                break;

                            case 4:
                                int conto4 = somma(tavolo4.ordineAttuale);
                                System.out.println("Amount to pay: $" + conto4);

                                tavolo4.ordineAttuale = null;
                                tavolo4.libero = true;
                                break;

                            case 5:
                                int conto5 = somma(tavolo5.ordineAttuale);
                                System.out.println("Amount to pay: $" + conto5);

                                tavolo5.ordineAttuale = null;
                                tavolo5.libero = true;
                                break;

                            case 6:
                                int conto6 = somma(tavolo6.ordineAttuale);
                                System.out.println("Amount to pay: $" + conto6);

                                tavolo6.ordineAttuale = null;
                                tavolo6.libero = true;
                                break;

                            default:
                                System.out.println("Table not available.");
                        }
                        break;

                    default:
                        System.out.println("Sold out.");
                }

            }
            input.close();
        }


        // Method to sum amount of order
        public static int somma(HashMap<Integer, Integer> conto){
            int a = 0;
            for (int i : conto.values()){
                a = a + i;
            }
            return a;
        }

    }
