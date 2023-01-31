package it.euris.academy2023.htmlrenderer;

import java.util.ArrayList;

public class AssetClassHTMLRenderer {

    private final PortfolioModel ptf;
    private final ColorWheel colorWheel;

    /**
     * Crea una renderer di asset class in html, partendo da una lista di stringhe (formato csv) e un set di colori.
     * @param csvData
     * @param colors
     */
    public AssetClassHTMLRenderer(ArrayList<String> csvData, String... colors) {
        this(new PortfolioModel(csvData), new ColorWheel(colors));
    }

    /**
     * Crea un renderer di asset class in html partendo da un modello di portfolio e da una ruota di colori (circular buffer)
     * @param ptf
     * @param colorWheel
     */
    public AssetClassHTMLRenderer(PortfolioModel ptf, ColorWheel colorWheel) {
        this.ptf = ptf;
        this.colorWheel = colorWheel;
    }

    /**
     * Utlizzando il portfolio e la ruota di colori crea una stringa HTML rappresentante il portfolio e renderizzabile tramite browser
     * @return
     */
    public String render() {
        PortfolioHTMLTable ptfHtml = new PortfolioHTMLTable(ptf, colorWheel, createHeader());
        return ptfHtml.render();
    }

    private PortfolioHTMLTableRow createHeader() {
        PortfolioHTMLTableRow header = new PortfolioHTMLTableRow();
        PortfolioHTMLTableColumn h1 = new PortfolioHTMLTableColumn(true, "#DDDDDD", "NOME ASSET");
        PortfolioHTMLTableColumn h2 = new PortfolioHTMLTableColumn(true, "#DDDDDD", "VALORE");
        header.getColumns().add(h1);
        header.getColumns().add(h2);
        return header;
    }
}
