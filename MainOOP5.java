import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;

public class MainOOP5 {
    public static void main(String[] args) {

        final StavkaRacuna mlijeko = new StavkaRacuna("mlijeko", new BigDecimal(2.5), new BigDecimal(1.89).setScale(2, RoundingMode.DOWN));
        final StavkaRacuna voda = new StavkaRacuna("voda", new BigDecimal(1.0), new BigDecimal(1.00).setScale(2, RoundingMode.DOWN));
        final Collection<StavkaRacuna> stavke = new ArrayList<>();
        final ZaglavljeRacuna racun1 = new ZaglavljeRacuna("1", "Silena", stavke);
        racun1.unosNoveStavke(mlijeko);
        racun1.unosNoveStavke(voda);
        racun1.ispisRacuna();
    }
}


//    Kreirati klasu StavkaRacuna koja ima
//        podatke artikl, količina, jedinicnaCijena i
//        iznos. Artikl, kolicina i cijena se definiraju
//        kod instanciranja objekta a iznos se
//        izračunava kao umnožak kolićine i jedinicne
//        cijene. Kreirati metodu za ispis stavke koja
//        ispisuje naziv artikla, količinu, jediničnu
//        cijenu i iznos stavke. Kreirati klasu
//        ZaglavljeRačuna koja ima podatke
//        redniBrojRacuna, nazivKonobara, kolekciju
//        stavaka te totalRacuna. Podaci
//        redniBrojRacuna, nazivKonobara i kolekcija
//        stavaka se dodaju kod instanciranja objekta,
//        dok se totalRacuna izračuna kao suma
//        iznosa svih dodanih stavaka. U klasi
//        ZaglavljeRacuna dodati metodu za unos
//        nove stavke. Pri unosu nove stavke odmah
//        se izračunava iznos stavke i total računa.
//        U main metodi prikazati funkcionalnost.