import java.math.BigDecimal;
import java.util.ArrayList;

public class MainOOP2 {
    public static void main(String[] args) {
        ArrayList<GeometrijskiLik> likovi = new ArrayList<>();
        likovi.add(new Krug(new BigDecimal(3)));
        likovi.add(new Pravokutnik(new BigDecimal(5), new BigDecimal(10)));
        likovi.add(new Kvadrat(new BigDecimal(5)));


        for (GeometrijskiLik lik : likovi) {
            System.out.println("Površina: " + lik.izracunPovrsine());
            System.out.println("Opseg: " + lik.izracunOpsega());
            System.out.println("----------------------");
        }
    }

}

//    Kreirati klasu GeometrijskiLik i nekoliko
//podklasa (npr, kvadrat, krug, pravokutnik...).
//        Sve potrebne dimenzije se definiraju kod
//        instanciranja objekta.
//        Implementirati metode za izračun površine i
//        opsega.
//        U main metodi kreirati kolekciju raznih
//        geometrijskih likova i ispisati opseg i
//        površinu svakog od njih.

