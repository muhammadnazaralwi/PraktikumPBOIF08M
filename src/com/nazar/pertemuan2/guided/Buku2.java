/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan2.guided;

/**
 *
 * @author alwi
 */
public class Buku2 {
    
    private String judul;
    private String pengarang;
    
    // Constructor tanpa parameter
    public Buku2() {
        judul = "Tidak diketahui";
        pengarang = "Tidak diketahui";
    }
    
    // Constructor dengan parameter
    public Buku2(String judul, String pengarang) {
        System.out.println("konstruktor buku sedang dijalankan...");
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    void cetakKeLayar() {
        if (judul == null && pengarang == null) {
            return;
        }
        
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
    }
}


