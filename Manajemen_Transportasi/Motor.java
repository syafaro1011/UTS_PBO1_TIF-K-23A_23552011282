package UTS.Manajemen_Transportasi;

class Motor extends Kendaraan {
    public Motor(String platNomor, String model, int tahun) {
        super(platNomor, model, tahun);
    }

    @Override //berdasarkan bahan bakar
    public double hitungBiayaPerjalanan() {
        return getJarak() / 40 * 10000; // 40KM/liter    Rp.10000/liter
    }

    
}