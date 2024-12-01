package UTS_Kendaraan;

class Mobil extends Kendaraan {
    public Mobil(String platNomor, String model, int tahun, int kapasitas, String BahanBakar) {
        super(platNomor, model, tahun, kapasitas, BahanBakar);
    }

    @Override //Berdasarkan biaya per kilometer
    public double hitungBiayaPerjalanan() {
        return getJarak() * 833; // Rp.833/km
    }

    

    

   
}