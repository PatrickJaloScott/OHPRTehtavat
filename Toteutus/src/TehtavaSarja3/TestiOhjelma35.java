package TehtavaSarja3;

import TehtavaSarja1.*;
import TehtavaSarja2.*;

public class TestiOhjelma35 {
    public static void main(String[] args) {
        Kello kello = Kello.getInstance();
        kello.setAika(0);
        Tapahtumalista tapahtumalista = new Tapahtumalista();
        Saapumisprosessi sX = new Saapumisprosessi(5);
        PalveluPiste pp1 = new PalveluPiste();
        for (int i = 0; i < 10; i++) {
            sX.luoUusiTapahtuma(tapahtumalista);
        }
        System.out.println("Viimeisen luodun tapahtuman aika: " + kello.getAika());

        for (Tapahtuma t : tapahtumalista.getTapahtumat()) {
            Asiakas a = new Asiakas();
            a.setAloitusaika(t.getAika());
            pp1.lisaaJonoon(a);
        }
        kello.siirraAika(5);
        pp1.palvele();
    }
}
