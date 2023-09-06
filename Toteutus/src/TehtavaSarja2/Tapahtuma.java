package TehtavaSarja2;

public class Tapahtuma implements Comparable<Tapahtuma> {
    private long aika;
    private TapahtumaTyyppi tyyppi;

    public Tapahtuma(long t_aika, TapahtumaTyyppi t_tyyppi) {
        this.aika = t_aika;
        this.tyyppi = t_tyyppi;
    }

    public long getAika() {
        return this.aika;
    }

    public int compareTo(Tapahtuma ta) {
        return (int)(aika - ta.aika);
    }

    @Override
    public String toString() {
        return this.tyyppi + ": " + this.aika;
    }
}
