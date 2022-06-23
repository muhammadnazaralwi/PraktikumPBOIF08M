/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan7.guided.agregasi;

/**
 *
 * @author alwi
 */
public class Perusahaan {
    private String namaPer;
    private Pegawai peg[]; // Agregasi antara pegawai dan perusahaan
    private int counter;
    
    public Perusahaan(String namaPer) {
        this.namaPer = namaPer;
        counter = 0;
        peg = new Pegawai[3];
        System.out.println("Konstruktor perusahaan dijalankan...");
    }
    
    public void insertPegawai(Pegawai p) {
        peg[counter] = p;
        counter++;
    }
    
    public void tampilPer() {
        System.out.println("Perusahaan " + namaPer + " memiliki pegawai : ");
        for (int i = 0; i < counter; i++) {
            peg[i].tampil();
        }
    }
}
