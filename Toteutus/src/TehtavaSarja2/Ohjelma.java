package TehtavaSarja2;

import java.util.Scanner;

public class Ohjelma {
    public static void main(String[] args) {
        long simulaatioalkuaika = System.nanoTime();
        Scanner lukija = new Scanner(System.in);
        Tapahtumalista tLista = new Tapahtumalista();

        String syotto;
        do {
            System.out.println("\n------------\nMitä tehdään?");
            System.out.println("[l]lisää, [p]poista, [t]tulosta lista, [x]lopeta");
            syotto = lukija.nextLine();
            switch (syotto) {
                case "l":
                    System.out.print("Montako tapahtumaa luodaan?: ");
                    int tapahtumaMaara = lukija.nextInt();
                    for (int i = 0; i < tapahtumaMaara; i++) {
                        tLista.lisaaTapahtuma(System.nanoTime() - simulaatioalkuaika);
                    }
                    break;
                case "p":
                    tLista.poistaTapahtuma();
                    break;
                case "t":
                    tLista.tulostaTapahtumat();
                    break;
                case "x":
                    System.out.println("Lopetetaan");
                    break;
                default:
                    System.out.println("Tunnistamaton syotto");
                    break;
            }
        } while (!syotto.equalsIgnoreCase("x"));
    }
}
