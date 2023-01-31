package it.euris.academy2023.htmlrenderer;

import java.util.ArrayList;

public class PortfolioHTMLTableRow {

    private ArrayList<PortfolioHTMLTableColumn> columns;

    public PortfolioHTMLTableRow() {
        this.columns = new ArrayList<>();
    }

    public ArrayList<PortfolioHTMLTableColumn> getColumns() {
        return columns;
    }

    public String render() {
        String html = "<tr>";
        for (PortfolioHTMLTableColumn col : columns) {
            html += col.render();
        }
        html += "</tr>";
        return html;
    }
}
