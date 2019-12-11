import java.util.Comparator;

public class Fakultetas implements Comparable{

    int pazymejimoNr;
    String pavardeVardas;
    String gimimoData;
    String grupe;
    double vidurkis;

    public Fakultetas(int pazymejimoNr, String pavardeVardas, String gimimoData,
                      String grupe, double vidurkis){
        this.pazymejimoNr = pazymejimoNr;
        this.pavardeVardas = pavardeVardas;
        this.gimimoData = gimimoData;
        this.grupe = grupe;
        this.vidurkis = vidurkis;
    }

    public int getPazymejimoNr(){
        return pazymejimoNr;
    }
    public void setPazymejimoNr(int pazymejimoNr){
        this.pazymejimoNr = pazymejimoNr;
    }
    public String getPavardeVardas(){
        return pavardeVardas;
    }
    public void setPavardeVardas(String pavardeVardas){
        this.pavardeVardas = pavardeVardas;
    }
    public String getGimimoData(){
        return gimimoData;
    }
    public void setGimimoData(String gimimoData){
        this.gimimoData = gimimoData;
    }
    public String getGrupe(){
        return grupe;
    }
    public void setGrupe(String grupe){
        this.grupe = grupe;
    }
    public double getVidurkis(){
        return vidurkis;
    }
    public void setVidurkis(double vidurkis){
        this.vidurkis = vidurkis;
    }

    @Override
    public String toString() {
        return   "pazymejimoNr = " + pazymejimoNr +
                ", pavardeVardas = " + pavardeVardas +
                ", gimimoData = " + gimimoData +
                ", grupe = " + grupe +
                ", vidurkis = " + vidurkis + "\n";
    }


    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(Fakultetas::getVidurkis)
                .reversed()
                .compare(this, (Fakultetas)o);
    }
}
