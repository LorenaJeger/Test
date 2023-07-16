public class Main10 {

    public static void main(String[] args) {
        System.out.println(brojRijeci("Mama ima puno posla."));
        System.out.println(brojRijeci("Mama."));
        System.out.println(brojRijeci(" "));
    }

    private static int brojRijeci(final String recenica) {
        int brojac = 1;
        if (recenica.length() == 1) return 0;
        int count = (int) recenica.chars().filter(s -> s == ' ').count();
        return brojac + count;
    }
}


//    Napiši metodu koja prima jedan tekstualni
//    parametar i vraća koliko ima riječi u
//        primljenom tekstu.
//        HINTS:  Delimiter za riječi je razmak