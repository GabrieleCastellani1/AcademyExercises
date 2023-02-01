package it.euris.academy2023.htmlrenderer;


public class ColorWheel {

    private final String[] colors;
    private int currentIndex;

    // La dicitura ... (varargs) è identica a quella dell'array, ma permette di passare come parametro gli elementi dell'array
    // come parametri individuali

    /**
     * Crea una ruota di colori partendo da un array di colori in formato esadecimale (es: #FFFFFF)
     * @param colors
     */
    public ColorWheel(String... colors) {
        this.colors = colors;
    }

    /**
     * Restituisce il prossimo elemento dell'array. Una volta terminato torna all'inizio (circular buffer)
     * @return
     */
    public String next() {
        if (currentIndex >= colors.length) {
            currentIndex = 0;
        }
        return colors[currentIndex++];
    }

}
