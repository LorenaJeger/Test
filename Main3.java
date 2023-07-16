public class Main3 {

    public static void main(String[] args) {
        final String recenica = "Lorena";
        System.out.println(izracunajSamoglasnike(recenica));
    }

    private static Integer izracunajSamoglasnike(final String recenica) {
        int brojac = 0;
        for (int i = 0; i < recenica.length(); i++) {
            final char trenutniChar = recenica.charAt(i);
            if (trenutniChar == 'a' || trenutniChar == 'e' || trenutniChar == 'i' || trenutniChar == 'o' || trenutniChar == 'u')
                brojac++;
        }
        return brojac;
    }
}

//    Napiši metodu koja prima tekstualni
//        parametar i vraća podatak koliko u tekstu
//        ima samoglasnika.
//        HINTS:
//        Dovoljno je podatak koliko ima ukupno
//        samoglasnika, nije potrebno za svaki
//        posebno.