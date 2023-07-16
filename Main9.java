public class Main9 {
    public static void main(String[] args) {
        System.out.println(isJakaLozinka("lozinka"));
        System.out.println(isJakaLozinka("Lozinka"));
        System.out.println(isJakaLozinka("Lozinka1"));
    }

    private static boolean isJakaLozinka(final String lozinka) {
        if (lozinka.length() < 8) return false;
        if (malaSlova(lozinka)) return false;
        if (velikaSlova(lozinka)) return false;
        if (!sadrziBroj(lozinka)) return false;
        return true;

    }

    private static boolean malaSlova(final String lozinka) {
        return lozinka.equals(lozinka.toUpperCase());
    }

    private static boolean velikaSlova(final String lozinka) {
        return lozinka.equals(lozinka.toLowerCase());
    }

    private static boolean sadrziBroj(final String lozinka) {
        final char[] lozinkaArray = lozinka.toCharArray();
        for (char slovo : lozinkaArray) {
            if (Character.isDigit(slovo)) return true;
        }
        return false;
    }
}


//    Napiši metodu koja prima jedan tekstualni
//    parametar i vraća podatak da li je vrijednost
//    dovoljno jaka lozinka.
//        Jaka lozinka mora sadržavati barem 8
//        znakova od čega je barem 1 veliko slovo,
//        barem 1 malo slovo i barem jedan broj.
//    Character.isDigit()