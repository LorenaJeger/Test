import java.util.ArrayList;

public class MainOOP4 {
    public static void main(String[] args) {
        ArrayList<Zivotinja> zivotinje = new ArrayList<>();
        zivotinje.add(new Pas("Tobi"));
        zivotinje.add(new Papiga("Zigi"));
        zivotinje.add(new Macka("Fujcek"));

        for (Zivotinja zivotinja : zivotinje) {
            StringBuilder str = new StringBuilder();
            str.append(zivotinja.getIme());
            str.append(" je ");
            str.append(zivotinja.getVrsta());
            str.append(" koja se glasa: ");
            str.append(zivotinja.glasanje());
            str.append(" i ima ");
            str.append(zivotinja.brNogu());
            str.append(" broja nogu");

            System.out.println(str);
        }
    }

}

//    Kreirati klasu Zivotinja te nekoliko podklasa
//    pojedinih zivotinja (Pas, Macka, Papiga,
//                         Riba...). Implementirati metodu koja vraća
//        tekst sljedećeg sadržaja: "<ime> je <vrsta
//        životinje> koja se glasa
//<glasanje_zivotinje> i ima <broj_nogu>
//nogu.".
//        Kod instanciranja objekata puni se samo ime
//        životinje (npr. Tobi, Minie....).
//        U main metodi napuniti kolekciju životinja i
//        ispisati opis za svaku od njih.