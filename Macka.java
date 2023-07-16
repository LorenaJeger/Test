public class Macka extends Zivotinja {
    protected Macka(String ime) {
        super(ime);
    }

    @Override
    String getVrsta() {
        return "macka";
    }

    @Override
    Integer brNogu() {
        return 4;
    }

    @Override
    String glasanje() {
        return "predenje";
    }
}
