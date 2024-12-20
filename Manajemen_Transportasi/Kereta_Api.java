package UTS.Manajemen_Transportasi;

class Kereta_Api extends Kendaraan implements TransportasiUmum {

    private double tarif;
    
        public Kereta_Api(String platNomor, String model, int tahun, double tarif) {
            super(platNomor, model, tahun);
            this.tarif = tarif;
    }
    @Override
    public void daftarKendaraan(String nama, String platNomor) {
        System.out.println("Kereta " + nama + " dengan nomor " + platNomor + " berhasil didaftarkan.");
        
    }

    @Override
    public void hitungRute(String asal, String tujuan, String jadwal) {
        System.out.println("Kereta jurusan " + asal + " - " + tujuan 
        + " Keberangkatan " + jadwal);
        
    }

    public void tampilkanInfo(){
        System.out.println("Dengan plat nomor " + getPlatNomor() +
                ", model " + getModel() +
                ", tahun " + getTahun() +
                ", tarif per penumpang: " + tarif +
                ", jumlah penumpang: " + getKapasitas());
    }
    @Override
    public double hitungBiayaPerjalanan() {
       return getKapasitas() * tarif;
    }

    

    
    
}
