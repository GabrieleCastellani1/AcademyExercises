package it.euris.academy2023.EserciziNiccolò.validator;

import java.util.ArrayList;

public class AnagraficaValidator {

    private ArrayList<Persona> persone;
    private ArrayList<AnagraficaOutput> anagraficaCorretta;
    private ArrayList<AnagraficaOutput> anagraficaErrata;


    private ArrayList<Persona> convert(ArrayList<String> anagraficaCsv) {
        ArrayList<Persona> listaPersone = new ArrayList<>();
        for (String line : anagraficaCsv) {
            Persona p = convert(line);
            listaPersone.add(p);
        }
        return listaPersone;
    }

    private Persona convert(String line) {
        String[] tokens = line.split(";");
        return new Persona(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
    }


    public AnagraficaValidator() {
        this.persone = new ArrayList<>();
        this.anagraficaCorretta = new ArrayList<>();
        this.anagraficaErrata = new ArrayList<>();
    }

    public AnagraficaValidator(ArrayList<String> anagraficaCsv) {
        this.persone = convert(anagraficaCsv);
        this.anagraficaCorretta = new ArrayList<>();
        this.anagraficaErrata = new ArrayList<>();
    }



    public ArrayList<String> getSuccessOutput() {
        return getCSV(anagraficaCorretta);
    }

    public ArrayList<String> getErrorOutput() {
        return getCSV(anagraficaErrata);
    }

    private static ArrayList<String> getCSV(ArrayList<AnagraficaOutput> anagraficaOutput) {
        ArrayList<String> listAnagrafica = new ArrayList<>();
        GeneratoreEsito generatoreEsito = new GeneratoreEsito();
        for (AnagraficaOutput output : anagraficaOutput) {
            listAnagrafica.add(generatoreEsito.printCSV(output));
        }
        return listAnagrafica;
    }


    //process deve prendere le persone e processarle, fa la validazione
    //validazione persone, creare output con le validazioni, predisporre CSV pronti
    public void process() {
        validate(anagraficaCorretta, anagraficaErrata);
    }


    private void validate(ArrayList<AnagraficaOutput> anagraficaCorretta, ArrayList<AnagraficaOutput> anagraficaErrata) {
        for (Persona persona : this.persone) {
            //validare ogni persona e in base all'output spedisco all'anagrafica corretta o errata
            AnagraficaOutput output = validate(persona);
            if (output.getErrore().isEmpty()) {
                anagraficaCorretta.add(output);
            } else {
                anagraficaErrata.add(output);
            }
        }
    }


    private AnagraficaOutput validate(Persona persona) {

        DataValidator dataValidator = new DataValidator();
        GenereValidator genereValidator = new GenereValidator();
        NumeroValidator numeroValidator = new NumeroValidator();
        AnagraficaOutput output = new AnagraficaOutput(persona.getCodiceFiscale());

        if (!dataValidator.validate(persona)) {
            output.getErrore().add(dataValidator.getErrorMessage());

        }
        if (!genereValidator.validate(persona)) {
            output.getErrore().add(genereValidator.getErrorMessage());
        }
        if (!numeroValidator.validate(persona)) {
            output.getErrore().add(numeroValidator.getErrorMessage());
        }



        return output;
    }


}
