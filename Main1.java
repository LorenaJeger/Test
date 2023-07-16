import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        final ArrayList<Integer> brojevi = new ArrayList<>();
        brojevi.add(5);
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(10);
        brojevi.add(9);
        izracunVrijednosti(brojevi);
    }

    private static void izracunVrijednosti(final ArrayList<Integer> brojevi) {
        if (brojevi.isEmpty()) return;
        final List<Integer> sortirano = brojevi.stream().sorted().toList();
        final HashMap rezultat = new HashMap<>();
        rezultat.put("min", sortirano.get(0));
        rezultat.put("max", sortirano.get(sortirano.size() - 1));
        rezultat.put("aritmeticka", izracunajAritmeticku(sortirano));
        rezultat.put("suma", sumirajNiz(sortirano));
        System.out.print(rezultat);
    }

    private static Integer sumirajNiz(final List<Integer> sortirano) {
        Integer tempSuma = 0;
        for (Integer s : sortirano) {
            tempSuma += s;
        }
        return tempSuma;
    }

    private static BigDecimal izracunajAritmeticku(final List<Integer> sortirano) {
        final BigDecimal suma = new BigDecimal(sumirajNiz(sortirano));
        return suma.divide(BigDecimal.valueOf(sortirano.size()));
    }
}


//   Zadatak 1 Napiši metodu koja izračunava osnovne
//        statističke vrijednosti (MIN, MAX, aritmetička
//        sredina, suma).
//        Metoda mora primati neodređeni niz brojeva
//        i vratiti u tekstualnom obliku prikaz
//        spomenutih vrijednosti. Iz dobivenog
//        rezultata mora se moći razlučiti svaka od
//        traženih vrijednosti (min, max, aritmetička
//        sredina i suma).