/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan3.guided.projectbuku;

/**
 *
 * @author alwi
 */
public class Buku {
    private String pengarang;
    private String judul;
    private int jmlhHalaman;
    private float diskon;
    private double harga;

    public Buku() {
        System.out.println("Konstruktor buku dijalankan...");
    }
    
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public void setJmlhHalaman(int JmlhHalaman) {
        jmlhHalaman = JmlhHalaman;
    }
    
    public String getPengarang() {
        return pengarang;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public int getJmlhHalaman() {
        return jmlhHalaman;
    }
    
    public void setInfo(float dskn, double HargaBuku) {
        diskon = dskn;
        harga = HargaBuku - (HargaBuku * diskon);
    }
    
    public void setInfo(double HargaBuku) {
        diskon = 0.1f;
        harga = HargaBuku - (HargaBuku * diskon);
    }
    
    public void cetak() {
        System.out.println("Judul Buku              : " + getJudul());
        System.out.println("Pengarang Buku          : " + getPengarang());
        System.out.println("Jumlah halaman Buku     : " + getJmlhHalaman() + " halaman");
        System.out.println("Diskon Buku             : " + diskon);
        System.out.println("Harga Buku              : " + harga);
        System.out.println("");
    }
    
}
