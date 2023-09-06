package TehtavaSarja3;

import TehtavaSarja2.*;
import eduni.distributions.*;

public class Saapumisprosessi extends Tapahtuma {
    TapahtumaTyyppi tapahtumaTyyppi = TapahtumaTyyppi.saapuminen;
    private Normal satunnaisGeneraattori = new Normal(10, 6);

    public Saapumisprosessi (long s_aika) {
        super(s_aika, TapahtumaTyyppi.saapuminen);
    }
    public void luoUusiTapahtuma(Tapahtumalista tLista) {
        Kello kello = Kello.getInstance();
        long uusiAika = (long)satunnaisGeneraattori.sample();
        kello.siirraAika(uusiAika);
        tLista.lisaaTapahtuma(new Saapumisprosessi(kello.getAika()));
    }
}
