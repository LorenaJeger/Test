public class Main7 {

    public static void main(String[] args) {
        ispisiVisekratnike(2);

    }

    private static void ispisiVisekratnike(final int broj) {
        final StringBuilder str = new StringBuilder();

        for (int i = 1; i < 11; i++) {
            str.append(broj * i);
            if (i != 10)
                str.append(",");

        }
        System.out.println(str);
    }
}

//    Napiši metodu koja prima jedan brojčani
//    parametar i vraća tekst koji sadrži prvih 10
//        višekratnika primljenog broja. Podaci se
//        vraćaju u tekstualnom obliku odvojeni
//        zarezom.