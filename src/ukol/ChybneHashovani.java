package ukol;

import java.util.HashSet;
import java.util.stream.Collectors;

class Ovoce {
    private int cena;
    private final String typ;

    @Override
    public String toString() {
        return "Ovoce{" +
                "cena=" + cena +
                ", typ='" + typ + '\'' +
                '}';
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
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

        HashSet<Ovoce> ovoceSet = new HashSet<>();
        for (int i = 6; i <= 8; i++) {
            ovoceSet.add(new Ovoce(i));
        }

        int targetPrice = 7;
        System.out.println("ovoceSet: " + ovoceSet);
        if (ovoceSet.stream().filter(l -> l.getCena() == 7).collect(Collectors.toSet()).isEmpty()) {
            System.out.println("Neobsahuje 7");
        } else {
            System.out.println("Obsahuje 7");
        }
    }
}