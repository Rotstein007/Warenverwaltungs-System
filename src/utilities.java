public class utilities {
    public Datum verfallsDatum;
}

class Datum{
    int tag;
    int monat;
    int jahr;

    public Datum(int tag, int monat, int jahr)
    {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }
}
