/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan7.guided.agregasi;

/**
 *
 * @author alwi
 */
public class Relasi {
    public static void main(String[] args) {
        Perusahaan per = new Perusahaan("Nusantara Jaya");
        Pegawai peg1, peg2, peg3;
        peg1 = new Pegawai("P001", "Rudi");
        peg2 = new Pegawai("P002", "Toni");
        peg3 = new Pegawai("P003", "Ani");
        // Relasi antara Class Pegawai dengan Class Perusahaan
        per.insertPegawai(peg1);
        per.insertPegawai(peg2);
        per.insertPegawai(peg3);
        System.out.println();
        per.tampilPer();
    }
}
