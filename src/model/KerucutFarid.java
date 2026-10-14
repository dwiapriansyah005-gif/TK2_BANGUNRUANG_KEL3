package model;

public class KerucutFarid extends BangunRuang{
    
    // Atribut
    private double jariJari;
    private double tinggi;
    private double garisPelukis;

    public KerucutFarid(double jariJari, double tinggi, double garisPelukis) {
        super();
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        this.garisPelukis = Math.sqrt(
                (jariJari * jariJari) + (tinggi * tinggi)
        );
    }

    public KerucutFarid() {
        super();
    }

    // Setter & Getter
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
        hitungGarisPelukis();
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
        hitungGarisPelukis();
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setGarisPelukis(double garisPelukis) {
        this.garisPelukis = garisPelukis;
    }

    public double getGarisPelukis() {
        return garisPelukis;
    }

    private void hitungGarisPelukis() {
        garisPelukis = Math.sqrt(
                (jariJari * jariJari) + (tinggi * tinggi)
        );
    }

    // Method hitung
    @Override
    public void volume() {
        Volume = (1.0 / 3.0) * Math.PI
                * jariJari * jariJari * tinggi;
    }

    @Override
    public void LuasPermukaaan() {
        LuasPermukaan = Math.PI * jariJari
                * (jariJari + garisPelukis);
    }
}