package UTS.Manajemen_Transportasi;

public class Main {
    public static void main(String[] args) {
        //registrasi kendaraan
        System.out.println("-----------Registrasi Kendaraan-----------");
        Mobil mobil = new Mobil("B1234XYZ", "Toyota Avanza", 2020);
        Bus bus = new Bus("B1894XYZ", "Hino", 2018, 75000);
        Motor motor = new Motor("B9012DEF", "Yamaha NMAX", 2022);
        Kereta_Api kereta = new Kereta_Api("KA12345", "KRL", 2020, 6000);

        mobil.setBahanBakar("Bensin");
        motor.setBahanBakar("Bensin");
        kereta.setBahanBakar("Listrik");
        bus.setBahanBakar("Solar");

        mobil.setJarak(100); 
        motor.setJarak(200); 
        
        bus.setKapasitas(50);
        kereta.setKapasitas(100);
        mobil.setKapasitas(7);
        motor.setKapasitas(2);

        System.out.println("- Mobil " + mobil.getModel()+ " nomor plat: "+mobil.getPlatNomor()+", tahun: "+mobil.getTahun()
        +", kapasitas penumpang "+mobil.getKapasitas()+", berbahan bakar "+mobil.getBahanBakar());
        System.out.println("- Motor " + motor.getModel()+ " nomor plat: "+motor.getPlatNomor()+", tahun: "+motor.getTahun()
        +", kapasitas penumpang "+motor.getKapasitas()+", berbahan bakar "+motor.getBahanBakar());
        System.out.println("- Kereta Api " + kereta.getModel()+ " nomor plat: "+kereta.getPlatNomor()+", tahun: "+kereta.getTahun()
        +", kapasitas penumpang "+kereta.getKapasitas()+", ditenagai "+kereta.getBahanBakar());
        System.out.println("- Bus " + bus.getModel()+ " nomor plat: "+bus.getPlatNomor()+", tahun: "+bus.getTahun()
        +", kapasitas penumpang "+bus.getKapasitas()+", bahan bakar "+bus.getBahanBakar());
        System.out.println("");

        //menghitung biaya kendaraan 
        System.out.println("-------------Biaya Perjalanan--------------");
        System.out.println("Biaya perjalanan dengan Mobil: Rp." + mobil.hitungBiayaPerjalanan());
        System.out.println("Biaya perjalanan dengan Sepeda Motor: Rp." + motor.hitungBiayaPerjalanan());
        System.out.println("Biaya perjalanan dengan kapasitas Bus "+bus.getKapasitas()+" penumpang: Rp." + bus.hitungBiayaPerjalanan());
        System.out.println("Biaya perjalanan dengan kapasitas Kereta "+kereta.getKapasitas()+" penumpang: Rp." + kereta.hitungBiayaPerjalanan());
        System.out.println("");

        //manajemen rute dan laporan perjalanan
        System.out.println("---------------Laporan Perjalanan--------------");
        bus.hitungRute("Bandung", "Jakarta", "12:20 - 13:40" );
        bus.tampilkanInfo();
        
        kereta.hitungRute("Ancol", "Bojonggede", "12:20 - 13:40" );
        kereta.tampilkanInfo();

        System.out.println("Mobil " +mobil.getModel()+ " dengan jarak "+mobil.getJarak()+" km menhabiskan biaya "+mobil.hitungBiayaPerjalanan());
        System.out.println("Motor " +motor.getModel()+ " dengan jarak "+motor.getJarak()+" km menhabiskan biaya "+motor.hitungBiayaPerjalanan());
    }
}

