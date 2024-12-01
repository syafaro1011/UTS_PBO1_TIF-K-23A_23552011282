package UTS.Manajemen_Transportasi;

public class Kendaraan {
    private String platNomor;
    private String model;
    private int tahun;
    private int kapasitas;
    private String BahanBakar;
    private int jarak;

    public Kendaraan(String platNomor, String model, int tahun) {
        this.platNomor = platNomor;
        this.model = model;
        this.tahun = tahun;
    }

    // Getter dan Setter (Encapsulation)
    public String getPlatNomor(){
        return platNomor;
    }

    public String getModel(){
        return model;
    }

    public int getTahun(){
        return tahun;
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



    
    //polymorph
    public double hitungBiayaPerjalanan(){
        return 0;
    }
}

