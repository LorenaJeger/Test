import java.util.ArrayList;

public class Student {
    private final String ime;
    private final String prezime;
    private final String maticniBroj;

    private static ArrayList<UpisaniKolegij> upisanikolegiji = new ArrayList<>();


    public Student(String ime, String prezime, String maticniBroj) {
        this.ime = ime;
        this.prezime = prezime;
        this.maticniBroj = maticniBroj;
    }

    protected void upisKolegija(final UpisaniKolegij kolegij) {
        upisanikolegiji.add(kolegij);
    }

    protected void upisOcijeneStudentu(final UpisaniKolegij kolegij, final Integer ocijena) {
        for (UpisaniKolegij trenutniKolegij : upisanikolegiji) {
            if (trenutniKolegij.getNaziv().equals(kolegij.getNaziv()))
                kolegij.upisOcijene(ocijena);
        }
    }

    protected void ispisOcijenaSvihKolegija() {
        for (UpisaniKolegij kolegij : upisanikolegiji) {
            System.out.println(kolegij.naziv + " ");
            kolegij.ispisOcijena();
            System.out.println("Prosjek: " + kolegij.izracunProsjeka());
            ;
        }
    }
}
