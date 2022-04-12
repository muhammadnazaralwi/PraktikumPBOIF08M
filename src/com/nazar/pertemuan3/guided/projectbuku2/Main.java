/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan3.guided.projectbuku2;

import java.util.HashSet;

/**
 *
 * @author alwi
 */
public class Main {
    public static void main(String[] args) {
        Buku bukuMatematika = new Buku();
        
//        Akses attribute melalui fungsi getter dan setter
//        bukuMatematika.setJudul("Buku Matematika Kelas 12");
//        
//        System.out.println("Judul " + bukuMatematika.getJudul());
        
        bukuMatematika.setJudul("Buku Matematika Kelas 12");
        bukuMatematika.setPengarang("Pak Agus");
        bukuMatematika.setJumlahHalaman(400);
        bukuMatematika.setInfo(0.1f, 45000);
        
        bukuMatematika.cetak();
        



//        Akses attribute secara public
//        bukuMatematika.judul = "Buku Matematika Kelas 12";
//        bukuMatematika.pengarang = "Pak Agus";
//        bukuMatematika.jumlahHalaman = 400;
//        bukuMatematika.diskon = 0.2f;
//        bukuMatematika.harga = 45000;
//        
//        System.out.println("Judul " + bukuMatematika.judul);
//        System.out.println("Pengarang " + bukuMatematika.pengarang);
//        System.out.println("Jumlah Halaman " + bukuMatematika.jumlahHalaman);
//        System.out.println("Diskon " + bukuMatematika.diskon);
//        System.out.println("Harga " + bukuMatematika.harga);
    }
}
