package it.euris.academy2023.EserciziMichael.esercizioConcessionaria;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.CatalogoConcessionaria;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.NotPresentException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestoreConcessionarie {
    private static GestoreConcessionarie gestoreInstance;
    private List<CatalogoConcessionaria> concessionarie;
    private GestoreConcessionarie(){
        this.concessionarie = new ArrayList<>();
    }

    public void setConcessionarie(List<CatalogoConcessionaria> concessionarie){
        this.concessionarie = concessionarie;
    }

    public static GestoreConcessionarie getGestoreInstance(){
        if(gestoreInstance == null){
            gestoreInstance = new GestoreConcessionarie();
        }
        return gestoreInstance;
    }

    public void addConcessionaria(CatalogoConcessionaria catalogoConcessionaria){
        this.concessionarie.add(catalogoConcessionaria);
    }

    public CatalogoConcessionaria searchConcessionaria(String nome) throws NotPresentException {
        return this.concessionarie
                .stream()
                .filter(con -> con.getNomeConcessionaria().equals(nome))
                .findFirst()
                .orElseThrow(() ->new NotPresentException("la concessionaria richiesta non esiste"));
    }

    public Iterator<CatalogoConcessionaria> iterator(){
        return this.concessionarie.iterator();
    }
}
