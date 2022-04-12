/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nazar.pertemuan2.guided;

/**
 *
 * @author alwi
 */
public class Buku {

    /**
     * @param args the command line arguments
     */
    private String judul;
    private String pengarang;
    private int jumlah;
    
    public void setNilai(String judul, 
            String pengarang, 
            int jumlah) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.jumlah = jumlah;
    }
    
    void cetakKeLayar() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah : " + jumlah);
    }
    
}
