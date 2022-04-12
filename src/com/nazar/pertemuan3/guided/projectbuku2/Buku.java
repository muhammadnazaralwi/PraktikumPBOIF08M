/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan3.guided.projectbuku2;

/**
 *
 * @author alwi
 */
public class Buku {
    private String judul;
    private String pengarang;
    private int jumlahHalaman;
    private float diskon;
    private double harga;
    
    public String getJudul() {
        return judul;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public float getDiskon() {
        return diskon;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    // Method Overloading 
    public void setInfo(float dskn, double hargaBuku){
        this.diskon = dskn;
        this.harga = hargaBuku-(hargaBuku*this.diskon);
    }
    
    public void setInfo(double hargaBuku){
        this.diskon = 0.1f;
        this.harga = hargaBuku-(hargaBuku*this.diskon);
    }
    
    public void cetak() {
        System.out.println("Judul Buku  : " +  this.judul);
        System.out.println("Pengarang Buku : " + getPengarang());
        System.out.println("Jumlah Halaman Buku : " 
                + getJumlahHalaman() 
                + " halaman");
        System.out.println("Diskon Buku : " + getDiskon());
        System.out.println("Harga Buku : " + getHarga());
    }
}
