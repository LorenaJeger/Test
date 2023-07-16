public class Main8 {

    public static void main(String[] args) {
        System.out.println(izracunFaktorijela(3));
        System.out.println(izracunFaktorijela(6));
    }

    public static int izracunFaktorijela(final int broj) {
        if (broj != 0)
            return (broj * izracunFaktorijela(broj - 1));
        return 1;

    }

}

//    Napiši metodu koja prima jedan brojčani
//    parametar i vraća izračunati faktorijel tog
//    broja
//            HINTS
//    Faktorijel je umnožak svih brojeva od 1 do
//        traženog broja