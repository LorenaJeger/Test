public class Main6 {

    public static void main(String[] args) {
        odradiMatematickuOperaciju(1, 3, '+');
        odradiMatematickuOperaciju(1, 3, '-');
        odradiMatematickuOperaciju(1, 3, '*');
        odradiMatematickuOperaciju(1, 3, '/');
    }


    private static void odradiMatematickuOperaciju(final int a, final int b, final char operacija) {
        switch (operacija) {

            case '+': {
                final int rezultat = a + b;
                System.out.println(a + "+" + b + " = " + rezultat);
                return;
            }
            case '-': {
                final int rezultat = a - b;
                System.out.println(a + "-" + b + " = " + rezultat);
                return;
            }
            case '*': {
                final int rezultat = a * b;
                System.out.println(a + "*" + b + " = " + rezultat);
                return;
            }
            case '/': {
                final int rezultat = a / b;
                System.out.println(a + "/" + b + " = " + rezultat);
                return;
            }

        }
    }


}

//    Napiši metodu koja prima 3 parametra.
//        Metoda primjenjuje matematičku operaciju
//        definiranu u parametru 3 nad prva dva
//        parametra. Redoslijed parametara je bitan.
//        Operacije koje je potrebno implementirati
//        (mogu biti u 3 parametru) su: zbrajanje,
//        oduzimanje, množenje i dijeljenje.