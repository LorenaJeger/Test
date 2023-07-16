import java.util.Stack;

public class Main2 {

    public static void main(String[] args) {

        System.out.println("Is polindrom Ana? " + isPolindrom("ANA VOLI MILOVANA"));

        System.out.println("Is polindrom Baka? " + isPolindrom("Baka tata"));

    }

    private static boolean isPolindrom(final String recenica) {
        final String foramtiranaRecenica = recenica.toLowerCase().replaceAll(" ", "");
        final int duzina = foramtiranaRecenica.length();
        for (int i = 0; i < duzina / 2; i++) {
            if (foramtiranaRecenica.charAt(i) != foramtiranaRecenica.charAt(duzina - 1 - i)) {
                return false;
            }
        }

        return true;
    }


//    Napiši metodu koja prima tekstualni
//    parametar i provjerava da li je tekst
//    palindrom.
//            HINTS:
//    Palindrom je tekst koji se jednako čita bez
//    obzira čitamo li ga s lijeva na desno ili s
//    desna na lijevo („ANA VOLI MILOVANA“).
//    Potrebno zanemariti razmake i velika i mala
//    slova.
}
