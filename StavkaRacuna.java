import java.math.BigDecimal;
import java.math.RoundingMode;

public class StavkaRacuna {
    private final String artikl;
    private final BigDecimal količina;
    private final BigDecimal jedinicnaCijena;
    private final BigDecimal iznos;

    private BigDecimal izracunIznosa() {
        return jedinicnaCijena.multiply(količina).setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal getIznos() {
        return iznos;
    }

    public StavkaRacuna(String artikl, BigDecimal količina, BigDecimal jedinicnaCijena) {
        this.artikl = artikl;
        this.količina = količina;
        this.jedinicnaCijena = jedinicnaCijena;
        this.iznos = izracunIznosa();
    }

    protected void ispisStavke() {
        StringBuilder str = new StringBuilder();
        str.append("Artikal: ").append(artikl).append(" kolicina: ").append(količina).append(" jedinicna cijena: ")
                .append(jedinicnaCijena).append(" iznos: ").append(iznos);
        System.out.println(str);
    }

}
