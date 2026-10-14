package model;


public class BolaFaul  extends BangunRuang {
    
    private double jariJari;

    public BolaFaul() {
        super();
    }

    public BolaFaul(double jariJari) {
        super();
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void volume() {
        Volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
                
    }

    @Override
    public void LuasPermukaaan() {
        LuasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);
                
    }
}