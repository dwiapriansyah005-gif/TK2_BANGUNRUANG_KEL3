package tk2_kelompok3;
public class KubusBetrin {
 //Atribut
    private double sisi;
    private double volume;
    private double luasPermukaan;
    
    // Setter & Getter 
    public void setSisi(double sisi) { this.sisi = sisi; }
    public double getSisi() { return sisi; }
    
    // Method hitung (return)
    public double volume() {
        volume = sisi * sisi * sisi;
        return volume;
    }
    public double luasPermukaan() {
        luasPermukaan= 6 * sisi * sisi;
        return luasPermukaan;
    }
}
