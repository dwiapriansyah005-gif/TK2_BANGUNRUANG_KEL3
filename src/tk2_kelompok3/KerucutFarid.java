package tk2_kelompok3;
public class KerucutFarid {
    
    // Atribut
    private double jariJari, tinggi, garisPelukis, volume, luasPermukaan;

    // Construcktor
    
    public KerucutFarid() {
    
    }

    public KerucutFarid(double jariJari, double tinggi, double garisPelukis) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        this.garisPelukis = garisPelukis;
    }
    
    

    // Setter & Getter
    public void setJariJari(double r) { this.jariJari = r; }
    public double getJariJari() { return jariJari; }

    public void setTinggi(double t) { this.tinggi = t; }
    public double getTinggi() { return tinggi; }

    public void setGarisPelukis(double s) { this.garisPelukis = s; }
    public double getGarisPelukis() { return garisPelukis; }

    // Method hitung (return)
    public void volume() {
       volume = (1.0/3.0) * Math.PI * jariJari * jariJari * tinggi;
    }
    public void luasPermukaan() {
        luasPermukaan= Math.PI * jariJari * (jariJari + garisPelukis);
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

  
    
}
