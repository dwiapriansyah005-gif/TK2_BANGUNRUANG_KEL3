package model;

public class TabungNatasza extends BangunRuang{
  private double jariJari;
    private double tinggi;

    public TabungNatasza() {
    }

    public TabungNatasza(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public void volume() {
        Volume = Math.PI * jariJari * jariJari * tinggi;
    }

    @Override
    public void LuasPermukaaan() {
        LuasPermukaan = 2 * Math.PI * jariJari
                * (jariJari + tinggi);
    }
}
