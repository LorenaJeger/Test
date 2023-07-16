public class MainOOP3 {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", "Duvnjak", "32");

        UpisaniKolegij matematika = new UpisaniKolegij("Matematika");
        UpisaniKolegij pis = new UpisaniKolegij("PIS");

        s1.upisKolegija(matematika);
        s1.upisKolegija(pis);
        s1.upisOcijeneStudentu(matematika, 4);
        s1.upisOcijeneStudentu(pis, 1);
        s1.upisOcijeneStudentu(matematika, 5);
        s1.upisOcijeneStudentu(matematika, 3);
        s1.ispisOcijenaSvihKolegija();

    }
}

//    Kreirati klasu Student koja sadrži podatke o
//studentu (ime, prezime, matični broj....).
//        Kreirati klasu UpisaniKolegij koja sadrži
//        podatke naziv i kolekciju ocjena.
//        Student ima podatak (kolekciju) svih
//        upisanih kolegija.
//        Dodati metodu za upis kolegija studentu kao
//        i upis ocjene iz određenog kolegija studentu.
//        Dodati metodu za izračun prosječne ocjene
//        za svaki od upisanih kolegija.
//        U main metodi prikazati funkcionalnost.