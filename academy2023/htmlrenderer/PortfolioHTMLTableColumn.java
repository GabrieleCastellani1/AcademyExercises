package it.euris.academy2023.htmlrenderer;

public class PortfolioHTMLTableColumn {

    private boolean header;
    private String color;
    private String label;

    public PortfolioHTMLTableColumn(boolean header, String color, String label) {
        this.header = header;
        this.color = color;
        this.label = label;
    }

    public boolean isHeader() {
        return header;
    }

    public String getColor() {
        return color;
    }

    public String getLabel() {
        return label;
    }

    public String render() {
        String html = header ? "<th" : "<td";
        html += " bgcolor=\"" + color + "\">";
        html += label;
        html += header ? "</th>" : "</td>";
        return html;
    }
}
