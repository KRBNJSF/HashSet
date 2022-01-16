package ukol;

import java.util.Collections;
import java.util.HashSet;

class Ovoce {
    public final int cena;
    private final String typ;

    @Override
    public String toString() {
        return "Ovoce{" +
                "cena=" + cena +
                ", typ='" + typ + '\'' +
                '}';
    }

    public Ovoce(int cena) {
        this.cena = cena;
        this.typ = "Jablko";
    }


}

public class ChybneHashovani {

    public static void main(String[] args) {
        System.out.println("Toto hashovani funguje:");
        HashSet<Integer> intSet = new HashSet<>();
        for (int i = 6; i <= 8; i++) {
            intSet.add(i);
        }
        System.out.println("intSet: " + intSet);
        System.out.println("obsahuje 7:" + intSet.contains(7));


        System.out.println("Toto hashovani nefunguje:");
        Ovoce ovoce = new Ovoce(7);
        if (ovoce.cena == 7) {
            System.out.println("ano");
        }
        HashSet<Ovoce> ovoceSet = new HashSet<>();
        ovoceSet.add(new Ovoce(6));
        ovoceSet.add(new Ovoce(7));

        if (ovoce.cena == 7) {
            System.out.println("ano, ano");
        }


        System.out.println("ovoceSet: " + ovoceSet);
        System.out.println("obsahuje 7:" + ovoceSet.contains(new Ovoce(7)));
    }
}