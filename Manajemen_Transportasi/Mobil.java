package UTS.Manajemen_Transportasi;

class Mobil extends Kendaraan {
    public Mobil(String platNomor, String model, int tahun) {
        super(platNomor, model, tahun);
    }

    @Override //Berdasarkan biaya per kilometer
    public double hitungBiayaPerjalanan() {
        return getJarak() * 833; // Rp.833/km
    }

    

    

   
}