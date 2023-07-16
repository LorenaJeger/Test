public abstract class Zivotinja {
    final private String ime;

    protected Zivotinja(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    abstract String getVrsta();

    abstract Integer brNogu();

    abstract String glasanje();
}
