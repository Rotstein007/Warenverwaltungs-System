public class Artikel {
    private int aktuelleNummer = 0;
    private int nummer;
    private String bezeichnung;
    private double preis;
    private int anzahl = 0;

    public Artikel(String bezeichnung, double preis, int anzahl)
    {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.anzahl = anzahl;
        this.nummer = nummer++;
    }

    public int getNummer()
    {
        return nummer;
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public double getPreis()
    {
        return preis;
    }

    public int getAnzahl()
    {
        return anzahl;
    }

    public void print() {
        System.out.println("Artikelnummer: " + nummer + ", Artikelbezeichnung: " + bezeichnung + ", Menge: " + anzahl);
    }

    public void einlagern(int menge) {
        anzahl += menge;
    }

    public void entnehmen(int menge) {
        if (this.anzahl >= menge) {
            this.anzahl -= menge;
        } else {
            System.out.println("Nicht genügend Zeug vorhanden");
        }
    }

    public boolean istWareOk() {
        return true;
    }
}