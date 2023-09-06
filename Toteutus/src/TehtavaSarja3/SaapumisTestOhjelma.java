package TehtavaSarja3;

import TehtavaSarja2.Tapahtumalista;

public class SaapumisTestOhjelma {
    public static void main(String[] args) {
        Kello kello = Kello.getInstance();
        kello.setAika(0);
        Tapahtumalista tapahtumalista = new Tapahtumalista();
        Saapumisprosessi sX = new Saapumisprosessi(5);
        for (int i = 0; i < 10; i++) {
            sX.luoUusiTapahtuma(tapahtumalista);
        }
        kello.setAika(0);
        tapahtumalista.tulostaTapahtumat();
    }
}
