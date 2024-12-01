package UTS_Kendaraan;

class Motor extends Kendaraan {
    public Motor(String platNomor, String model, int tahun, int kapasitas, String BahanBakar) {
        super(platNomor, model, tahun, kapasitas, BahanBakar);
    }

    @Override //berdasarkan bahan bakar
    public double hitungBiayaPerjalanan() {
        return getJarak() / 40 * 10000; // 40KM/liter    Rp.10000/liter
    }

    
}