package TehtavaSarja3;

public class Kello {
    private long aika = 0;
    private static Kello kelloInstance = null;
    private Kello() {}
    public static Kello getInstance() {
        if(kelloInstance == null) {
            kelloInstance = new Kello();
        }
        return kelloInstance;
    }
    public void setAika(long uusiAika) {
        this.aika = uusiAika;
    }

    public void siirraAika(long aikaVali) {
        this.aika += aikaVali;
    }

    public long getAika() {
        return this.aika;
    }
}
