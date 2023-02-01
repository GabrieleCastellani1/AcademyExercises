package it.euris.academy2023.htmlrenderer;

import java.util.ArrayList;
import java.util.List;

public class PortfolioModel {

    private List<AssetClass> assetClasses;

    /**
     * Crea una portfolio model a partire da un csv
     *
     * @param csvData
     */
    public PortfolioModel(List<String> csvData) {
        assetClasses = convert(csvData);
    }

    public PortfolioModel() {
        assetClasses = new ArrayList<>();
    }


    public void setAssetClasses(List<AssetClass> assetClasses) {
        this.assetClasses = assetClasses;
    }

    public List<AssetClass> getAssetClasses() {
        return assetClasses;
    }

    // Gestisce la conversione di una lista di stringhe in una lista di AssetClass
    private List<AssetClass> convert(List<String> csvData) {
        List<AssetClass> assetClasses = new ArrayList<>();
        for (String line : csvData) {
            AssetClass ac = convert(line);
            assetClasses.add(ac);
        }
        return assetClasses;
    }

    // Gestisce la conversione di una stringa in una asset class
    private AssetClass convert(String line) {
        // Split su ";" e creazione dell'asset class
        String[] tokens = line.split(";");
        String nome = tokens[0];
        float value = Float.parseFloat(tokens[1]);
        return new AssetClass(nome, value);
    }
}
