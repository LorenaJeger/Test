public class Papiga extends Zivotinja {

    protected Papiga(String ime) {
        super(ime);
    }

    @Override
    String getVrsta() {
        return "Papiga";
    }

    @Override
    Integer brNogu() {
        return 2;
    }

    @Override
    String glasanje() {
        return "jezik papige";
    }
}
