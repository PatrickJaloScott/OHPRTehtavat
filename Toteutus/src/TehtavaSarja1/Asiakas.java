package TehtavaSarja1;

public class Asiakas {
    private int id;
    private static int nykyId = 0;
    private long aloitusaika,
        lopetusaika;

    public Asiakas() {
        this.id = ++nykyId;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public long getAloitusaika() {
        return aloitusaika;
    }

    public void setAloitusaika(long aloitusaika) {
        this.aloitusaika = aloitusaika;
    }

    public long getLopetusaika() {
        return lopetusaika;
    }

    public void setLopetusaika(long lopetusaika) {
        this.lopetusaika = lopetusaika;
    }

    public long kulunutaika() {
        return this.lopetusaika - this.aloitusaika;
    }
}
