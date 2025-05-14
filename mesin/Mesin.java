package mesin;

public class Mesin {
    protected int jumlahSilinder;
    protected double kapasitasSilinder; // dalam liter
    protected double langkah; // dalam mm

    // Constructor
    public Mesin(int jumlahSilinder, double kapasitasSilinder, double langkah) {
        this.jumlahSilinder = jumlahSilinder;
        this.kapasitasSilinder = kapasitasSilinder;
        this.langkah = langkah;
    }

    // Getter and Setter
    public int getJumlahSilinder() {
        return jumlahSilinder;
    }

    public void setJumlahSilinder(int jumlahSilinder) {
        this.jumlahSilinder = jumlahSilinder;
    }

    public double getKapasitasSilinder() {
        return kapasitasSilinder;
    }

    public void setKapasitasSilinder(double kapasitasSilinder) {
        this.kapasitasSilinder = kapasitasSilinder;
    }

    public double getLangkah() {
        return langkah;
    }

    public void setLangkah(double langkah) {
        this.langkah = langkah;
    }
}