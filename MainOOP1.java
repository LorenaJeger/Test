import java.math.BigDecimal;

public class MainOOP1 {
    public static void main(String[] args) {
        Racun r1 = new Racun("01", "Marko Misic", new BigDecimal(22.00));
        Racun r2 = new Racun("02", "Marija Misic", new BigDecimal(50.00));
        System.out.println("Broj računa:" + r1.getBroj() + " saldo: " + r1.getSaldo());

        r1.prebaciIznos(r2, new BigDecimal(10.00));
        System.out.println("Broj računa:" + r1.getBroj() + " saldo: " + r1.getSaldo());
        System.out.println("Broj računa:" + r2.getBroj() + " saldo: " + r2.getSaldo());
    }

}

//    Kreirati klasu Racun koja sadrži podatke: broj
//        računa, ime i prezime vlasnika te saldo
//        (početni saldo se definira kod instanciranja
//        objekta). Potrebno je implementirati
//        mogućnost prebacivanja sredstava s jednog
//        računa na drugi (transakcija osigurava
//        umanjenje salda jednog računa i uvećanje
//        salda drugog računa).
//        U main metodi prikazati primjer
//        prebacivanja sredstava i ispis salda prije i
//        nakon prebacivanja.