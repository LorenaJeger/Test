import java.math.BigDecimal;

public class Krug extends GeometrijskiLik {
    final private BigDecimal radijus;

    public Krug(BigDecimal radijus) {
        this.radijus = radijus;
    }

    @Override
    public BigDecimal izracunPovrsine() {
        return radijus.multiply(radijus).multiply(new BigDecimal(3.14)).setScale(2, BigDecimal.ROUND_DOWN);

    }

    @Override
    public BigDecimal izracunOpsega() {
        return radijus.multiply(new BigDecimal(2)).multiply(new BigDecimal(3.14)).setScale(2, BigDecimal.ROUND_DOWN);
    }
}
