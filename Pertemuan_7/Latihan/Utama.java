package Pertemuan_7.Latihan;

public class Utama {
    public static void main(String[] args) {
        System.out.println("=============TUGAS=============");
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.luas();
        bangunDatar.keliling();
        System.out.println("===========LINGKARAN===========");
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
        System.out.println("============PERSEGI============");
        Persegi persegi = new Persegi();
        System.out.println("luas Persegi : " + persegi.luas());
        System.out.println("Keliling Persegi : " + persegi.keliling());
        System.out.println("===========SEGITIGA============");
        Segitiga segitiga = new Segitiga();
        System.out.println("luas Segitiga : " + segitiga.luas());
        System.out.println("Keliling Segitiga : " + segitiga.keliling());
        System.out.println("============SELESAI============");
        
    }
}
