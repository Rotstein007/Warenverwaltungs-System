public class Haushaltsgeraet extends Artikel{
    private double anschlussLeistung;
    private double gewicht;

    public Haushaltsgeraet(String bezeichnung, double preis, int menge, double anschlussLeistung, double gewicht) {
        super(bezeichnung, preis, menge);
        this.anschlussLeistung = anschlussLeistung;
        this.gewicht = gewicht;
    }
}
