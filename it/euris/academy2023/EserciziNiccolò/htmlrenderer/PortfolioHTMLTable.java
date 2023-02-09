package it.euris.academy2023.EserciziNiccolò.htmlrenderer;

import java.util.ArrayList;
import java.util.List;

public class PortfolioHTMLTable {

    private List<PortfolioHTMLTableRow> rows;

    public PortfolioHTMLTable(PortfolioModel ptf, ColorWheel colorWheel, PortfolioHTMLTableRow header) {
        rows = convert(ptf, colorWheel);
        rows.add(0, header);
    }

    public PortfolioHTMLTable() {
        rows = new ArrayList<>();
    }

    public List<PortfolioHTMLTableRow> getRows() {
        return rows;
    }

    private List<PortfolioHTMLTableRow> convert(PortfolioModel ptf, ColorWheel colorWheel) {
        // Devo convertire l'oggetto PortfolioModel (lista di AssetClass) in una lista di PortfolioHTMLTableRow
        List<PortfolioHTMLTableRow> outList = new ArrayList<>();
        List<AssetClass> assetClasses = ptf.getAssetClasses();
        for (AssetClass ac : assetClasses) {
            // Delego a un altro metodo la conversione di ogni AssetClass in una PortfolioHTMLTableRow
            PortfolioHTMLTableRow row = convert(ac, colorWheel);
            outList.add(row);
        }
        return outList;
    }

    private PortfolioHTMLTableRow convert(AssetClass ac, ColorWheel colorWheel) {
        // Ogni PortfolioHTMLTableRow contiene due colonne, una contenente il nome dell'asset class e una il valore
        PortfolioHTMLTableRow row = new PortfolioHTMLTableRow();

        // Prendo UNA volta il colore (altrimenti cambia per le due colonne)
        String color = colorWheel.next();

        // Creo le due colonne, assegnando un booleano per indicare se si tratta o no di un header, il colore e nome e in seguito valore dell'asset class
        PortfolioHTMLTableColumn colName = new PortfolioHTMLTableColumn(false, color, ac.getNome());
        PortfolioHTMLTableColumn colValue = new PortfolioHTMLTableColumn(false, color, String.valueOf(ac.getValore()));

        // Aggiungo le due colonne appena create alla riga
        row.getColumns().add(colName);
        row.getColumns().add(colValue);

        return row;
    }

    public String render() {
        // Ogni rendere si occupa di stampare il dettaglio html relativo solo alla sua sezione. Il codice
        // relativo alle altre sezioni viene delegato a queste
        String html = "<table>";
        for (PortfolioHTMLTableRow row : rows) {
            html += row.render();
        }
        html += "</table>";
        return html;
    }
}
