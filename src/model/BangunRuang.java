package model;

public class BangunRuang {

    protected double Volume;
    protected double LuasPermukaan;

    public void volume() {
        // Rumus volume ditentukan oleh subclass
    }

    public void LuasPermukaaan() {
        // Rumus luas permukaan ditentukan oleh subclass
    }

    public double getVolume() {
        return Volume;
    }

    public double getLuasPermukaan() {
        return LuasPermukaan;
    }
}