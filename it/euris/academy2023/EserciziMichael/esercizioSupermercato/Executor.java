package it.euris.academy2023.EserciziMichael.esercizioSupermercato;

import it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions.EntryNotPresentExceeption;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions.MarketNotPresentException;

public class Executor {
    private final GestoreSupermercati gestoreSupermercati;
    private final GestoreAcquisti gestoreAcquisti;

    public Executor(GestoreSupermercati gestoreSupermercati, GestoreAcquisti gestoreAcquisti) {
        this.gestoreSupermercati = gestoreSupermercati;
        this.gestoreAcquisti = gestoreAcquisti;
    }

    public String execute(String command){
        String operation;

        operation = command.substring(0, command.indexOf(":"));

        if (operation.equalsIgnoreCase("searchP")) {

            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String supermercato = tokens[0];
            String prodotto = tokens[1];
            try {
                return gestoreSupermercati.findProdotto(prodotto, supermercato);
            } catch (MarketNotPresentException e) {
                return " supermercato non presente";
            }

        } else if (operation.equalsIgnoreCase("searchAllP")) {

            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String supermercato = tokens[0];
            try {
                return gestoreSupermercati.findAllProdotti(supermercato);
            } catch (MarketNotPresentException e) {
                return "supermercato non presente";
            }

        } else if (operation.equalsIgnoreCase("searchR")) {

            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String supermercato = tokens[0];
            String reparto = tokens[1];
            try {
                return gestoreSupermercati.isPresent(supermercato, reparto);
            } catch (MarketNotPresentException e) {
                return "supermercato non presente";
            }
        }else if(operation.equalsIgnoreCase("buyP")) {
            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String supermercato = tokens[0];
            String prodotto = tokens[1];
            int quantità = Integer.parseInt(tokens[2]);
            try {
                return gestoreAcquisti.acquistaDaSupermercato(prodotto, supermercato, quantità);
            } catch (MarketNotPresentException e) {
                return "supermercato non presente";
            }
        }else if(operation.equalsIgnoreCase("removeP")){
            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String prodotto = tokens[0];
            try {
                return gestoreAcquisti.rimuoviDaCarrello(prodotto);
            } catch (EntryNotPresentExceeption e) {
                return "entry non presente";
            }
        }else if(operation.equalsIgnoreCase("printCarrello")){
            return gestoreAcquisti.stampaCarrello();
        }else if(operation.equalsIgnoreCase("checkoutCarrello")){
            return gestoreAcquisti.checkoutCarrello();
        } else {
            return "non esiste un simile comando";
        }
    }
}
