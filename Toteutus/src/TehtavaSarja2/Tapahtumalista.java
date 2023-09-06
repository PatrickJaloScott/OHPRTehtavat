package TehtavaSarja2;

import TehtavaSarja3.Saapumisprosessi;
import java.util.PriorityQueue;

public class Tapahtumalista {

    private PriorityQueue<Tapahtuma> tapahtumat = new PriorityQueue<>();

    public Tapahtuma seuraavaTapahtuma() {
        return tapahtumat.peek();
    }

    public void lisaaTapahtuma(long aloitusAika) {
        tapahtumat.add(new Tapahtuma(aloitusAika, TapahtumaTyyppi.saapuminen));
        tapahtumat.add(new Tapahtuma(aloitusAika, TapahtumaTyyppi.poistuminen));
    }

    public void lisaaTapahtuma(Saapumisprosessi sProsessi) {
        tapahtumat.add(sProsessi);
    }

    public void poistaTapahtuma() {
        tapahtumat.remove();
    }

    public PriorityQueue<Tapahtuma> getTapahtumat() {
        return this.tapahtumat;
    }

    public void tulostaTapahtumat() {
        System.out.println("Tapahtumat");
        tapahtumat.forEach(tapahtuma -> System.out.print(tapahtuma + " \n"));
    }
}
