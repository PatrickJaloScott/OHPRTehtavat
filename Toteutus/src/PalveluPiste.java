import java.util.LinkedList;
import java.util.Scanner;
public class PalveluPiste {
    // Toteuttaa teht 1.5 ja 1.6
    private static LinkedList<Asiakas> jono = new LinkedList<>();

    public static void main(String[] args) throws InterruptedException {
        Scanner syotto = new Scanner(System.in);
        System.out.print("Syötä tulevien asiakkaiden määrä: ");
        int asiakasMaara = syotto.nextInt();
        for (int i = 0; i < asiakasMaara; i++) {
            lisaaJonoon(new Asiakas());
        }
        palvele();

        syotto.close();
    }
    public static void lisaaJonoon(Asiakas a) {
        a.setAloitusaika(System.nanoTime());
        jono.add(a);
    }

    static Asiakas poistaJonosta() {
        Asiakas p = jono.peek();
        if (p != null) {
            p.setLopetusaika(System.nanoTime());
            //System.out.println("Asiakas (id: " + p.getId() + ") poistettu");
        }
        return jono.pop();
    }

    static void palvele() {
        // Ilmoita edellisen ohjelman lopuksi keskimääräinen palvelupisteessä vietetty aika (= kaikkien asiakkaiden jonossa vietettyjen aikojen keskiarvo).
        //Mieti, mitä kaikkea tarvitset tätä varten.
        int palvelleetAsiakkaat = 0;
        long asiakkaanAika, kokonaisAika = 0;
        while (!jono.isEmpty()) {
            long palveluaika = 5;
            try {
                Thread.sleep((long) (Math.random() * palveluaika) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            asiakkaanAika = poistaJonosta().kulunutaika();
            System.out.println("Asiakkaan aika jonossa: " + asiakkaanAika * Math.pow(10,-8));
            kokonaisAika += asiakkaanAika;
            palvelleetAsiakkaat++;
        }
        System.out.println("Keskimääräin palveluaika: " + kokonaisAika/(palvelleetAsiakkaat * Math.pow(10,8)));
    }
}
