import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        System.out.println(brojponavljanja("Lorena želi na NightExpress", 'L'));
//       System.out.println(brojponavljanja2("Lorena želi na NightExpress", 'L'));
    }

    private static long brojponavljanja(final String recenica, final Character slovo) {
        return recenica.chars().filter(s -> s == slovo).count();

    }

}


//    Napiši metodu koja prima dva tekstualna
//    parametra od kojih je prvi tekst a drugi
//    jedan znak. Metoda vraća podatak koliko se
//        puta znak iz drugog parametra pojavljuje u
//        tekstu. Potrebno je razlikovati velika i mala
//        slova.
//        HINTS:
//        Razmak (space) je invalidan znak za drugi
//        parametar
//        Višesložni znakovi su invalidne vrijednosti za
//        drugi parametar (npr. NJ, LJ, DŽ)