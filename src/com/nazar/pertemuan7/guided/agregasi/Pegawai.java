/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan7.guided.agregasi;

/**
 *
 * @author alwi
 */
public class Pegawai {
    private String nama;
    private String NIP;
    
    public Pegawai() {
        System.out.println("Konstruktor pegawai dijalankan...");
    }
    
    public Pegawai(String NIP, String nama) {
        this.NIP = NIP;
        this.nama = nama;
        System.out.println("Konstruktor pegawai dijalankan...");
    }
    
    public void tampil() {
        System.out.println("NIP : " + NIP + " , Nama : " + nama);
    }
}
