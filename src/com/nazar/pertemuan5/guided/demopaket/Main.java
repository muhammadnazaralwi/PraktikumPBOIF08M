/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan5.guided.demopaket;

/**
 *
 * @author alwi
 */
public class Main {
    public static void main(String[] args) {
        Paket a = new Paket("Pemrograman Berorientasi Objek",
                            "Benyamin Langgu Sinaga",
                            60000,
                            "700 MB",
                            50000);
        a.hitungHargaPaket();
        a.cetakPaket();
    }
}
