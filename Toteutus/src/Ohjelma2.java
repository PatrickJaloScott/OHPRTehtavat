import java.util.Scanner;
import java.util.LinkedList;
public class Ohjelma2 {
    // Toteuttaa teht. 1.4
    static LinkedList<Asiakas> asiakasLista = new LinkedList<>();
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String syotto;
        do {
            System.out.println("Mitä tehdään? [L]isää, [P]oista, Lopeta[x]");
            syotto = lukija.nextLine();
            if(syotto.equalsIgnoreCase("l")) {
                uusiAsiakas();
            } else if(syotto.equalsIgnoreCase("p")) {
                poistaAsiakas();
            }
        } while (syotto.equalsIgnoreCase("x"));

        lukija.close();
    }

    static void uusiAsiakas() {
        Asiakas a = new Asiakas();
        a.setAloitusaika(System.nanoTime());
        asiakasLista.add(a);
    }

    static void poistaAsiakas() {
        if(!asiakasLista.isEmpty()) {
            Asiakas p = asiakasLista.get(0);
            p.setLopetusaika(System.nanoTime());
            asiakasLista.remove(p);
            System.out.println("Asiakkaan aika jonossa: " + p.kulunutaika());
        }
    }
}
