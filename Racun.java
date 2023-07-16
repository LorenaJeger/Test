import java.math.BigDecimal;

public class Racun {
    private final String broj;
    private final String imeIPrezime;

    private void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    private BigDecimal saldo;

    public String getBroj() {
        return broj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Racun(String broj, String imeIPrezime, BigDecimal saldo) {
        this.broj = broj;
        this.imeIPrezime = imeIPrezime;
        this.saldo = saldo;
    }

    protected void prebaciIznos(final Racun primatelj, final BigDecimal iznos) {
        final BigDecimal noviIznosPosiljatelja = saldo.subtract(iznos);
        if (noviIznosPosiljatelja.compareTo(BigDecimal.ZERO) < 0) return;
        saldo = noviIznosPosiljatelja;
        primatelj.setSaldo(primatelj.getSaldo().add(iznos));
    }
}
