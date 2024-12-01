package UTS_Kendaraan;

public class Main {
    public static void main(String[] args) {
        //registrasi kendaraan
        System.out.println("-----------Registrasi Kendaraan-----------");
        Mobil mobil = new Mobil("B1234XYZ", "Toyota Avanza", 2020, 7, "Bensin");
        Bus bus = new Bus("B1894XYZ", "Hino", 2018, 51, "Solar", 75000);
        Motor motor = new Motor("B9012DEF", "Yamaha NMAX", 2022, 2, "Bensin");
        Kereta_Api kereta = new Kereta_Api("KA12345", "KRL", 2020, 100, "Listrik", 6000);

        System.out.println("- Mobil " + mobil.getModel()+ " nomor plat: "+mobil.getPlatNomor()+", tahun: "+mobil.getTahun()
        +", kapasitas penumpang "+mobil.getKapasitas()+", berbahan bakar "+mobil.getBahanBakar());
        System.out.println("- Motor " + motor.getModel()+ " nomor plat: "+motor.getPlatNomor()+", tahun: "+motor.getTahun()
        +", kapasitas penumpang "+motor.getKapasitas()+", berbahan bakar "+motor.getBahanBakar());
        System.out.println("");

        //menghitung biaya kendaraan 
        mobil.setJarak(100); //jarak 100km
        motor.setJarak(200); //jarak 200km
        System.out.println("-------------Biaya Perjalanan--------------");
        System.out.println("Biaya perjalanan dengan Mobil: Rp." + mobil.hitungBiayaPerjalanan());
        System.out.println("Biaya perjalanan dengan Sepeda Motor: Rp." + motor.hitungBiayaPerjalanan());
        System.out.println("Biaya perjalanan dengan kapasitas Bus "+bus.getKapasitas()+" penumpang: Rp." + bus.hitungBiayaPerjalanan());
        System.out.println("");

        //manajemen rute dan laporan perjalanan
        System.out.println("---------------Manajemen Rute--------------");
        bus.hitungRute("Bandung", "Jakarta", "12:20 - 13:40" );
        bus.tampilkanInfo();
        System.out.println("");
        kereta.hitungRute("Ancol", "Bojonggede", "12:20 - 13:40" );
        kereta.tampilkanInfo();

        System.out.println("");
        System.out.println("Mobil " +mobil.getModel()+ " dengan jarak "+mobil.getJarak()+" km menhabiskan biaya "+mobil.hitungBiayaPerjalanan());
        System.out.println("Motor " +motor.getModel()+ " dengan jarak "+motor.getJarak()+" km menhabiskan biaya "+motor.hitungBiayaPerjalanan());
    }
}

