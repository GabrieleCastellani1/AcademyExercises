package it.euris.academy2023.EserciziNiccolò.validator;

public class GeneratoreEsito {
    public String printCSV(AnagraficaOutput output) {
        String outputMessage = output.getCodiceFiscale();
        for (String errore : output.getErrore()) {
            outputMessage += ";" + errore;
        }
        return outputMessage;
    }
}
