/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tk2_kelompok3;

/**
 *
 * @author macbookairm12020
 */
public class MainBagunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Dwi Limas Segi Empat
        DwiLimassegiempat limas = new DwiLimassegiempat(15, 10, 5);

        limas.volume();
        limas.luasPermukaan();

        System.out.println("------Limas Segi Empat------");
        System.out.println("Rumus Volume (V) = 1/3 * s * s * t");
        System.out.println("Rumus Luas Permukaan (L) = (s*s) + 4*(1/2 * s * tinggiSisi)");
        System.out.println("Diketahui : s = " + (int) limas.getSisiAlas());
        System.out.println("Diketahui : t = " + (int) limas.getTinggiLimas());
        System.out.println("Diketahui : tinggiSisi = " + (int) limas.getTinggiSisi());
        System.out.println("Ditanya : V, L?");

        System.out.printf("Volume = %.2f%n", limas.getVolume());
        System.out.printf("Luas Permukaan = %.2f%n", limas.getLuasPermukaan());
        System.out.println("");

        //Sifaul Bola
        BolaFaul bola = new BolaFaul(7);

        bola.volume();
        bola.luasPermukaan();

        System.out.println("------Bola------");
        System.out.println("Rumus Volume (V) = 4/3 * phi * r * r * r");
        System.out.println("Rumus Luas Permukaan (L) = 4 * phi * r * r");
        System.out.println("Diketahui : r = " + (int) bola.getJariJari());
        System.out.println("Diketahui : phi = " + String.format("%.2f", Math.PI));
        System.out.println("Ditanya : V, L?");

        System.out.printf("Volume = %.2f%n", bola.getVolume());
        System.out.printf("Luas Permukaan = %.2f%n", bola.getLuasPermukaan());
        System.out.println("");

        //Farid Kerucut
        KerucutFarid kerucut = new KerucutFarid(7, 10, 12);

        kerucut.volume();
        kerucut.luasPermukaan();

        System.out.println("------Kerucut------");
        System.out.println("Rumus Volume (V) = 1/3 * phi * r * r * t");
        System.out.println("Rumus Luas Permukaan (L) = phi * r * (r + s)");
        System.out.println("Diketahui : r = " + (int) kerucut.getJariJari());
        System.out.println("Diketahui : t = " + (int) kerucut.getTinggi());
        System.out.println("Diketahui : s = " + (int) kerucut.getGarisPelukis());
        System.out.println("Ditanya : V, L?");

        System.out.printf("Volume = %.2f%n", kerucut.getVolume());
        System.out.printf("Luas Permukaan = %.2f%n", kerucut.getLuasPermukaan());
        System.out.println("");

        //Bagas Balok
        BalokBagas balok = new BalokBagas(8, 4, 3);

        balok.volume();
        balok.LuasPermukaaan();

        System.out.println("------Balok------");
        System.out.println("Rumus Volume (V) = p * l * t");
        System.out.println("Rumus Luas Permukaan (L) = 2 * ((p*l) + (p*t) + (l*t))");
        System.out.println("Diketahui : p = " + (int) balok.getPanjang());
        System.out.println("Diketahui : l = " + (int) balok.getLebar());
        System.out.println("Diketahui : t = " + (int) balok.getTinggi());
        System.out.println("Ditanya : V, L?");

        System.out.printf("Volume = %.2f%n", balok.getVolume());
        System.out.printf("Luas Permukaan = %.2f%n", balok.getLuasPermukaan());
        System.out.println("");
    }

}
