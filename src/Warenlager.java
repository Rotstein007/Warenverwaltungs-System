public class Warenlager {
    private Artikel[] artikel;

    // Konstruktor
    public Warenlager(int anzahlArtikel) {
        artikel = new Artikel[anzahlArtikel];
    }

    // Methode zum Einlagern von Artikeln
    public void einlagern(Artikel artikel, int menge) {
        // Implementierung abhängig von den Anforderungen
    }

    // Methode zum Entnehmen von Artikeln
    public void entnehmen(int artikelnummer, int menge) {
        // Implementierung abhängig von den Anforderungen
    }

    // Methode zur regelmäßigen Überprüfung der Artikel im Lager
    public void artikelPrüfen() {
        // Implementierung abhängig von den Anforderungen
    }
}
