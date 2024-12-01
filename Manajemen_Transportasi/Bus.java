package UTS.Manajemen_Transportasi;

class Bus extends Kendaraan implements TransportasiUmum {
    private double tarif;
    public Bus(String platNomor, String model, int tahun, double tarif) {
        super(platNomor, model, tahun);
        this.tarif = tarif;
    }

    @Override
    public void daftarKendaraan(String nama, String platNomor) {
        System.out.println("Bus " + nama + " dengan plat " + platNomor + " berhasil didaftarkan.");
        
    }

    @Override
    public void hitungRute(String asal, String tujuan, String jadwal) {
        System.out.println("Bus rute " + asal + " - " + tujuan 
        + " dengan jadwal keberangkatan " + jadwal);
        
    }

    @Override
    public double hitungBiayaPerjalanan() {
        return (getKapasitas() - 1) * tarif; //menghitung biaya satu bus
    }

    public void tampilkanInfo(){
        System.out.println("Dengan plat nomor " + getPlatNomor() +
                ", model " + getModel() +
                ", tahun " + getTahun() +
                ", tarif per penumpang: " + tarif +
                ", jumlah penumpang: " + getKapasitas());
    }
    
}
