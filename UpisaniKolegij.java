import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class UpisaniKolegij {
    final String naziv;

    public String getNaziv() {
        return naziv;
    }

    public ArrayList<Integer> getOcijene() {
        return ocijene;
    }

    private void setOcijene(ArrayList<Integer> ocijene) {
        this.ocijene = ocijene;
    }

    ArrayList<Integer> ocijene = new ArrayList<>();

    public UpisaniKolegij(String naziv) {
        this.naziv = naziv;
    }

    protected void upisOcijene(final Integer ocijena) {
        ocijene.add(ocijena);
    }

    protected void ispisOcijena() {
        final StringBuilder str = new StringBuilder();
        for (Integer ocjenu : ocijene) {
            str.append(ocjenu);
            str.append(" ");
        }
        System.out.println(str);
    }

    protected BigDecimal izracunProsjeka() {
        int brojac = 0;
        int ukupnaSuma = 0;
        for (Integer ocijenu : ocijene) {
            ukupnaSuma += ocijenu;
            brojac++;
        }
        return new BigDecimal(ukupnaSuma / brojac).setScale(2, RoundingMode.DOWN);
    }
}
