public class Ohjelma1 {
    public static void main(String[] args) {
        // Toteuttaa teht 1.3
        Asiakas a = new Asiakas();
        Asiakas b = new Asiakas();
        a.setAloitusaika(System.nanoTime());
        b.setAloitusaika(System.nanoTime());

        a.setLopetusaika(System.nanoTime());
        b.setLopetusaika(System.nanoTime());

        System.out.println("Asiakas a");
        System.out.println("Id: " + a.getId());
        System.out.println("Alku: " + a.getAloitusaika() + ", loppu: " + a.getLopetusaika());
        System.out.println("Kulunut aikaa: " + a.kulunutaika());
        System.out.println();
        System.out.println("Asiakas b");
        System.out.println("Id: " + b.getId());
        System.out.println("Alku: " + b.getAloitusaika() + ", loppu: " + b.getLopetusaika());
        System.out.println("Kulunut aikaa: " + b.kulunutaika());
        System.out.println();
    }
}
