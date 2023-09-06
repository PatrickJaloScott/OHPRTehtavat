package TehtavaSarja1;

import TehtavaSarja3.Kello;

import java.util.LinkedList;

public class PalveluPiste {
    private LinkedList<Asiakas> jono = new LinkedList<>();

    /*public static void main(String[] args) throws InterruptedException {
        Scanner syotto = new Scanner(System.in);
        System.out.print("Syötä tulevien asiakkaiden määrä: ");
        int asiakasMaara = syotto.nextInt();
        for (int i = 0; i < asiakasMaara; i++) {
            lisaaJonoon(new TehtavaSarja1.Asiakas());
        }
        palvele();

        syotto.close();
    }*/
    public void lisaaJonoon(Asiakas a) {
        jono.add(a);
    }

    Asiakas poistaJonosta() {
        Asiakas p = jono.peek();
        if (p != null) {
            p.setLopetusaika(Kello.getInstance().getAika());
        }
        return jono.pop();
    }

    public void palvele() {
        int palvelleetAsiakkaat = 0;
        long asiakkaanAika, kokonaisAika = 0;
        while (!jono.isEmpty()) {
            asiakkaanAika = poistaJonosta().kulunutaika();
            System.out.println("Asiakkaan aika jonossa: " + asiakkaanAika);
            kokonaisAika += asiakkaanAika;
            palvelleetAsiakkaat++;
        }
        System.out.println("Keskimääräin palveluaika: " + kokonaisAika/palvelleetAsiakkaat);
    }
}
