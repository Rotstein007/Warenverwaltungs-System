import java.util.Date;

public class Michprodukt extends Artikel{
    private Date verfallsDatum;
    private double maxLagerTemperatur;


    public Milchprodukt(String bezeichnung, double preis, int anzahl, Date verfallsDatum){
        super(bezeichnung, preis, anzahl);
        this.verfallsDatum = verfallsDatum;
    }

    public boolean istWareOk(){
        return verfallsDatum.after(new Date());
    }
}
