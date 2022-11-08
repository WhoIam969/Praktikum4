package Pertemuan_7.Latihan;

public class Lingkaran extends BangunDatar {
    int r = 6;


    @Override
    public float luas() {
        return (float) (3.14 * r * r);
    }
    @Override
    public float keliling() {
        return (float) (3.14 * r * 1/4);
    }
}
