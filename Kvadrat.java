import java.math.BigDecimal;

public class Kvadrat extends GeometrijskiLik {

    public Kvadrat(BigDecimal stranica) {
        this.stranica = stranica;
    }

    final private BigDecimal stranica;

    @Override
    public BigDecimal izracunPovrsine() {
        return stranica.multiply(stranica).setScale(2, BigDecimal.ROUND_DOWN);
    }

    @Override
    public BigDecimal izracunOpsega() {
        return stranica.multiply(new BigDecimal(4)).setScale(2, BigDecimal.ROUND_DOWN);
    }
}