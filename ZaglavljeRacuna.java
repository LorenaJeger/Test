import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;

public class ZaglavljeRacuna {
    private final String redniBrojRacuna;
    private final String nazivKonobara;
    private Collection<StavkaRacuna> stavke = new ArrayList<>();
    private BigDecimal total;


    public ZaglavljeRacuna(String redniBrojRacuna, String nazivKonobara, Collection<StavkaRacuna> stavke) {
        this.redniBrojRacuna = redniBrojRacuna;
        this.nazivKonobara = nazivKonobara;
        this.stavke = stavke;
        this.total = izracunTotala();
    }

    private BigDecimal izracunTotala() {
        BigDecimal total = BigDecimal.ZERO.setScale(2, RoundingMode.DOWN);
        for (StavkaRacuna stavkaRacuna : stavke) {
            total = total.add(stavkaRacuna.getIznos());
        }
        return total;
    }

    protected void unosNoveStavke(final StavkaRacuna stavka) {
        stavke.add(stavka);
        this.total = izracunTotala();
    }

    protected void ispisRacuna() {
        System.out.println("Redni broj racuna: " + redniBrojRacuna);
        for (StavkaRacuna stavkaRacuna : stavke) {
            stavkaRacuna.ispisStavke();
        }
        System.out.println("Total:" + total);
    }

}
