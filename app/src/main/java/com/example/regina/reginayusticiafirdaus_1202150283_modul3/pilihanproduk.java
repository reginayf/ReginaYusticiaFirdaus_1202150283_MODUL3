package com.example.regina.reginayusticiafirdaus_1202150283_modul3;

/**
 * Created by acer on 2/24/2018.
 */

public class pilihanproduk {
    int gambar;
    String nama;
    int harga;
    String keterangan;

    public pilihanproduk(int gambar, String nama, int harga, String keterangan) {
        this.gambar = gambar;
        this.nama = nama;
        this.harga = harga;
        this.keterangan = keterangan;
    }

    public int getGambar() {
        return gambar;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getKeterangan(){return keterangan;}
}
