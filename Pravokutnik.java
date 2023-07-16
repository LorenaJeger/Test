import java.math.BigDecimal;

public class Pravokutnik extends GeometrijskiLik {

    final private BigDecimal duzina;
    final private BigDecimal sirina;

    public Pravokutnik(BigDecimal duzina, BigDecimal sirina) {
        this.duzina = duzina;
        this.sirina = sirina;
    }

    @Override
    public BigDecimal izracunPovrsine() {
        return duzina.multiply(sirina).setScale(2, BigDecimal.ROUND_DOWN);
    }

    @Override
    public BigDecimal izracunOpsega() {
        final BigDecimal duzinaISirina = duzina.add(sirina);
        return duzinaISirina.multiply(new BigDecimal(2)).setScale(2, BigDecimal.ROUND_DOWN);
    }
}
