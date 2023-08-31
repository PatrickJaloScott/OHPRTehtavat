package TehtavaSarja2;

import java.util.Scanner;

public class IkaJakauma {
    // Taulukko arvot
    // satunnaisluvun arvovälit esitetty -min ja -max taulukoilla
    static int[] satunnaisValitMin = {0, 5, 20, 40, 70, 85, 95},
            satunnaisValitMax = {4, 19, 39, 69, 84, 94, 99},
    // ikätaulukko
        iat = {19, 20, 21, 23, 25, 27, 30},
    // tuloksia varten käytettävä taulukko
        tulokset = new int[iat.length];
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int opiskelijamaara = inputPrompt(lukija, "Montako ihmistä käytetään");
        // silmukoidaan arpoluvun generointi
        for (int i = 0; i < opiskelijamaara; i++) {
            // luodaan arpoluku välistä [0, 100]
            int arpoluku = (int)(Math.random() * 100);
            // verrataan luotu arpoluku satunnaisväleihin,
            // silmukoimalla kaikkia välejä
            for (int j = 0; j < iat.length; j++) {
                int min = satunnaisValitMin[j],
                    max = satunnaisValitMax[j];
                // jos arpoluku on satunnaisvälin sisällä...
                if(onValissa(arpoluku, min, max)) {
                    // nostetaan tulosta indeksi j:n kohdalla
                    tulokset[j]++;
                }
            }
        }
        double kokonaisvirhe = 0;
        // tulostetaan tulokset
        for (int i = 0; i < tulokset.length; i++) {
            // jaetaan tulos prosentiksi
            double prosentti = (double) (tulokset[i]*100) /opiskelijamaara,
                    virhe = Math.abs((satunnaisValitMax[i]-satunnaisValitMin[i]+1)-prosentti);
            kokonaisvirhe += virhe;
            System.out.printf("Ikää %d tuli %d kertaa (%.1f%%)\tVirhe %.2f%%\n", iat[i], tulokset[i], prosentti, virhe);
        }
        kokonaisvirhe /= tulokset.length;
        System.out.printf("\nTuloksista tuli %.2f%% keskimääräinen kokonaisvirhe", kokonaisvirhe);
    }

    // apufunktio jolla verrataan luku min-max väliin
    static Boolean onValissa(int x, int min, int max) {
        return (min <= x && x <= max);
    }

    public static int inputPrompt(String message) {
        System.out.print(message + ": ");
        return new Scanner(System.in).nextInt();
    }

    public static int inputPrompt(Scanner s, String message) {
        System.out.print(message + ": ");
        return s.nextInt();
    }
}
