public class BolaFaul {
    
    private double jariJari;
    private double volume;
    private double luasPermukaan;

    public BolaFaul(){
        
    }

    public BolaFaul(double jariJari) {
        this.jariJari = jariJari;
    }
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    // Mohamad Syifa'ul Amal - 202557201025
    

    public void volume() {
        this.volume = (4.0/3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    public void luasPermukaan() {
        this.luasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
    public double getJariJari(){
        return jariJari;
    }
}

