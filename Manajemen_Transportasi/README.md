# UTS Pemrograman Berorientasi Obyek 1
<ul>
  <li>Mata Kuliah: Pemrograman Berorientasi Obyek 1</li>
  <li>Dosen Pengampu: <a href="https://github.com/Muhammad-Ikhwan-Fathulloh">Muhammad Ikhwan Fathulloh</a></li>
</ul>

## Profil
<ul>
  <li>Nama: Syaiful Fathur Rozaq</li>
  <li>NIM: 23552011282</li>
  <li>Studi Kasus: Sistem Manajemen Transportasi</li>
</ul>

## Judul Studi Kasus
<p>Sistem Manajemen Transportasi</p>

## Penjelasan Studi Kasus
<p>Studi kasus yang saya buat adalah tentang Sistem Manajemen Transportasi yang dirancang 
menggunakan 4 pilar utama OOP (Object-Oriented Programming): Inheritance, 
Polymorphism, Encapsulation, dan Abstraction. Sistem ini memiliki beberapa fitur utama 
seperti registrasi kendaraan, hitung biaya perjalanan, manajemen rute, dan laporan perjalanan. Meregistrasi kendaraan seperi mobil, motor, bus dan menghitung biaya yang diggunakan dalam suatu perjalanan. Adapun transportasi umum seperti bus dan kereta api yang mana memiliki rute untuk menghitung biaya yang digunakan. Menghasilkan laporan tentang perjalan dari setiap kendaraan.</p>

## Penjelasan 4 Pilar OOP dalam Studi Kasus

### 1. Inheritance
<p>Dalam studi kasus ini, saya menggunakan konsep inheritance dengan membuat kelas Kendaraan sebagai kelas induk. Di kelas ini memiliki atribut umum yaitu plat nomor, model, dan tahun. Kelas induk ini memiliki 4 kelas turunan yaitu kelas Mobil, kelas Motor, Kelas Bus, dan kelas Kereta_Api. Masing-masing dari kelas turunan mewarisi atribut umum pada kelas Kendaraan.</p>

### 2. Encapsulation
<p>Dalam studi kasus ini, konsep encapsulation diterapkan pada atribut kapasitas dan bahabakar yang disembunyikan di kelas Kendaraan. Hanya dapat dkontrol dan diakses menggunakan method setKapasistas() dan setBahanBakar(). Juga saya menambahkan atribut jarak yang hanya dikontrol dan diakses method setJarak() sebagai keperluan dalam menghitung biaya perjalanan.</p>

### 3. Polymorphism
<p>Dalam studi kasus ini, konsep polymorphism diterapkan pada methode hitungBiayaPerjalanan() yang berada dikelas Kendaraan. Di overriding dan digunakan sebagai perhitungan biaya perjalanan dimasing-masing subclass dengan perhitungan berbeda-beda.</p>

### 4. Abstract
<p>Dalam studi kasus ini menggunakan interface TransportasiUmum yang mana didalamnya ada abstraksi daftarKendaraan(String nama, String platNomor) dan hitungRute(String asal, String tujuan, String jadwal) yang diimplementasikan pada jenis transportasi umum / kelas Bus dan kelas Kereta_Api. Yang mana transportasi umum ditentukan oleh rute dalam operasionalnya.</p>

## Demo Proyek
<ul>
  <li>Github: <a href="https://github.com/syafaro1011/UTS_PBO1_TIF-K-23A_23552011282/tree/main">Github</a></li>
  <li>Youtube: <a href="">Youtube</a></li>
</ul>
