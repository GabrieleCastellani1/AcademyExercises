package it.euris.academy2023.books;

public class Book implements Comparable<Book>{
    private String titolo;
    private String autore;
    private int anno;
    private String genere;

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public Book() {
    }

    public Book(String titolo, String autore, int anno, String genere) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "titolo : " + this.titolo + ", " +
                "autore : " + this.autore + ", " +
                "anno : " + this.anno + ", " +
                "genere : " + this.genere;
    }

    @Override
    public int compareTo(Book o) {
        if(this.anno < o.getAnno()){
            return -1;
        }else if(this.anno > o.getAnno()){
            return 1;
        }else{
            return 0;
        }
    }
}
