/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author macbookairm12020
 */
public class DwiLimassegiempat extends BangunRuang {

    // Atribut
    private double sisi;
    private double tinggi;
    private double tinggiSisiTegak;

    public DwiLimassegiempat(
            double sisi, double tinggi, double tinggiSisiTegak) {
        super();
        this.sisi = sisi;
        this.tinggi = tinggi;
        this.tinggiSisiTegak = tinggiSisiTegak;
    }

    public DwiLimassegiempat() {
        super();
    }

    // Setter & Getter
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggiSisiTegak(double tinggiSisiTegak) {
        this.tinggiSisiTegak = tinggiSisiTegak;
    }

    public double getTinggiSisiTegak() {
        return tinggiSisiTegak;
    }

    // Method hitung
    @Override
    public void volume() {
        Volume = (1.0 / 3.0) * sisi * sisi * tinggi;
    }

    @Override
    public void LuasPermukaaan() {
        LuasPermukaan = (sisi * sisi)
                + (2 * sisi * tinggiSisiTegak);
    }
}
