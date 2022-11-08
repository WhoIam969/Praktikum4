package Pertemuan_7.Latihan;

public class Persegi extends BangunDatar {
    int sisi = 5;

    @Override
    public float luas() {
        return sisi * sisi;
    }
    @Override
    public float keliling() {
        return 4 * sisi;
    }
}
