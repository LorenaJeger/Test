public class Pas extends Zivotinja {
    protected Pas(String ime) {
        super(ime);
    }

    @Override
    String getVrsta() {
        return "pas";
    }

    @Override
    Integer brNogu() {
        return 4;
    }

    @Override
    String glasanje() {
        return "lajanje";
    }
}
