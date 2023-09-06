package TehtavaSarja3;

public class TestaaKelloOhjelma {
    public static void main(String[] args) {
        // kello = new Kello();
        // new Kello ei toimi, koska konstruktori on private
        // käytetään luokan Singleton-instanssi muuttuja getInstance
        Kello kello = Kello.getInstance();
        kello.setAika(1);
        System.out.println("Aika on " + kello.getAika());
        kello.setAika(5);
        System.out.println("Aika on " + kello.getAika());

        // jos luodaan toinen Kello olio
        Kello clock = Kello.getInstance();
        // katsotaan sen aikaa
        System.out.println("The clock says " + clock.getAika());
        // tulostaa alkuperäisen ajan, sillä se on tallennettu instanssimuuttujaan
    }
}
