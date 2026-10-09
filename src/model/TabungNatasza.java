package model;

public class TabungNatasza {
   private double jariJari;
    private double tinggi;
    private double volume;
    private double luasPermukaan;
//    public TabungNatasza(double jariJari, double tinggi){
//        this.jariJari = jariJari;
//        this.tinggi = tinggi;
//    }

    public double getJariJari() {
        return jariJari;
    }

    public TabungNatasza() {
        
    }

    public TabungNatasza(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }
    
    
    

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double volume() {
        volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        return volume;
    }
    public double luasPermukaan() {
        luasPermukaan = 2 * Math.PI * jariJari * (jariJari + tinggi);
        return luasPermukaan;
    }

}
