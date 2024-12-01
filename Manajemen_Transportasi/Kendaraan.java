package UTS_Kendaraan;

public class Kendaraan {
    private String platNomor;
    private String model;
    private int tahun;
    private int kapasitas;
    private String BahanBakar;
    private int jarak;

    public Kendaraan(String platNomor, String model, int tahun, int kapasitas, String BahanBakar) {
        this.platNomor = platNomor;
        this.model = model;
        this.tahun = tahun;
        this.kapasitas = kapasitas;
        this.BahanBakar = BahanBakar;
    }

    // Getter dan Setter (Encapsulation)
    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getBahanBakar() {
        return BahanBakar;
    }

    public void setBahanBakar(String BahanBakar) {
        this.BahanBakar = BahanBakar;
    }

    public int getJarak() {
        return jarak;
    }

    public void setJarak(int jarak) {
        this.jarak = jarak;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    
    //polymorph
    public double hitungBiayaPerjalanan(){
        return 0;
    }
}

