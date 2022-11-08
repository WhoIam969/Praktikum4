package Pertemuan_7.Latihan;

public class Segitiga extends BangunDatar {
    int alas = 5;
    int tinggi = 8;

    @Override
    public float luas() {
        return alas * tinggi * 1/2;
    }
    @Override
    public float keliling() {
        return alas + alas + alas;
    }
}
