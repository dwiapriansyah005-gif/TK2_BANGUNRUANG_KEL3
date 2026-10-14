package model;

public class KubusBetrin extends BangunRuang{
    //Atribut
    private double sisi;

    public KubusBetrin(double sisi) {
        super();
        this.sisi = sisi;
    }

    public KubusBetrin() {
        super();
    }

    // Setter & Getter
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    // Method hitung
    @Override
public void volume() {
    Volume = sisi * sisi * sisi;
}

@Override
public void LuasPermukaaan() {
    LuasPermukaan = 6 * sisi * sisi;
}
}
