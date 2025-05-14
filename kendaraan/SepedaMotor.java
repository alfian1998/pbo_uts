package kendaraan;

import mesin.Mesin;

public class SepedaMotor {
    private String bahanBakar;
    private Mesin mesin;
    private String tipeMotor; // Atribut tambahan

    // Constructor
    public SepedaMotor(String bahanBakar, Mesin mesin, String tipeMotor) {
        this.bahanBakar = bahanBakar;
        this.mesin = mesin;
        this.tipeMotor = tipeMotor;
    }

    // Getter and Setter
    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public String getTipeMotor() {
        return tipeMotor;
    }

    public void setTipeMotor(String tipeMotor) {
        this.tipeMotor = tipeMotor;
    }
}