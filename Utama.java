import kendaraan.SepedaMotor;
import kendaraan.Mobil;
import mesin.Mesin;

public class Utama {
    public static void main(String[] args) {
        // Membuat objek Mesin untuk SepedaMotor
        Mesin mesinMotor = new Mesin(1, 0.15, 49.5);
        SepedaMotor motor = new SepedaMotor("Bensin", mesinMotor, "Sport");

        // Membuat objek Mesin untuk Mobil
        Mesin mesinMobil = new Mesin(4, 1.5, 84.0);
        Mobil mobil = new Mobil("Solar", mesinMobil, 4);

        // Cetak atribut SepedaMotor
        System.out.println("Sepeda Motor:");
        System.out.println("Bahan Bakar: " + motor.getBahanBakar());
        System.out.println("Tipe Motor: " + motor.getTipeMotor());
        System.out.println("Mesin: ");
        System.out.println("  Jumlah Silinder: " + motor.getMesin().getJumlahSilinder());
        System.out.println("  Kapasitas Silinder: " + motor.getMesin().getKapasitasSilinder() + " liter");
        System.out.println("  Langkah: " + motor.getMesin().getLangkah() + " mm");

        // Cetak atribut Mobil
        System.out.println("\nMobil:");
        System.out.println("Bahan Bakar: " + mobil.getBahanBakar());
        System.out.println("Jumlah Pintu: " + mobil.getJumlahPintu());
        System.out.println("Mesin: ");
        System.out.println("  Jumlah Silinder: " + mobil.getMesin().getJumlahSilinder());
        System.out.println("  Kapasitas Silinder: " + mobil.getMesin().getKapasitasSilinder() + " liter");
        System.out.println("  Langkah: " + mobil.getMesin().getLangkah() + " mm");
    }
}