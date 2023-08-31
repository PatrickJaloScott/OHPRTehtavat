package TehtavaSarja2;

import java.util.PriorityQueue;

public class Tapahtumalista {

    private PriorityQueue<Tapahtuma> tapahtumat = new PriorityQueue<>();

    public Tapahtuma seuraavaTapahtuma() {
        return tapahtumat.peek();
    }

    public void lisaaTapahtuma(long aloitusAika) {
        tapahtumat.add(new Tapahtuma(aloitusAika, Tapahtuma.TapahtumanTyyppi.saapuminen));
        tapahtumat.add(new Tapahtuma(aloitusAika, Tapahtuma.TapahtumanTyyppi.poistuminen));
    }

    public void poistaTapahtuma() {
        tapahtumat.remove();
    }

    public void tulostaTapahtumat() {
        System.out.println("Tapahtumat");
        tapahtumat.forEach(tapahtuma -> System.out.print(tapahtuma + " "));
    }
}
