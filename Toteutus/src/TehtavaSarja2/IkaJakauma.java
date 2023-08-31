package TehtavaSarja2;

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
        // silmukoidaan arpoluvun generointi
        for (int i = 0; i < 1000; i++) {
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
        // tulostetaan tulokset
        for (int i = 0; i < tulokset.length; i++) {
            // jaetaan tulos 10:llä
            // ('tulos/1000' on desimaali nollan ja ykkösen välissä...
            // joten 'tulos * 100 / 1000' voi kirjoittaa tulos/10)
            double prosentti = tulokset[i]/10.0;
            System.out.printf("Ikää %d tuli %d kertaa ja on %.1f prosenttia tuloksista\n", iat[i], tulokset[i], prosentti);
        }
    }

    // apufunktio jolla verrataan luku min-max väliin
    static Boolean onValissa(int x, int min, int max) {
        return (min < x && x < max);
    }
}
